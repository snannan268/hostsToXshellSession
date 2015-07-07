import org.apache.commons.lang3.math.NumberUtils
import org.apache.commons.lang3.StringUtils

def formula = '100/(sum(LLossMax + tt) + avg(NO) + sum (ttttt))/sum(LLossMaxAtt)/(100)/sum(xxx)'
def regexp = ~/(\([?:\w|\s|\+|\-|\*|\\/]*\))/
//def regexp = ~/(\([?:\w|\s|\+|\-|\*|\\/]*\))|([\(|\)|\+|\-|\*|\\/])/

if (formula.contains('/')) {
    char tt = 'A'
    def finalAggElement = []
    def kpiElement = []
    formula.tokenize('/').each {
        def stringBuilder = new StringBuilder()
//        println it
        if (NumberUtils.isNumber(it.replace('(', '').replace(')', ''))) {
            finalAggElement << it
        } else {
            def matcher = regexp.matcher(it)
            while (matcher.find()) {
//                println "GroupCount: ${matcher.groupCount()} group ${matcher.group(0)} ${matcher.group(1)}"
                if (matcher.group(0)) {
                    stringBuilder.append(matcher.group(0))
                }
            }
            kpiElement << stringBuilder.toString() + " as ${tt}"
            finalAggElement << "sum(${tt})"
            tt++
        }

//        println(it + NumberUtils.isNumber(it.replace('(', '').replace(')', '')))
    }
    println formula
    println "finalAggElement: ${finalAggElement.join('/')}"
    println "kpiElement: ${kpiElement.join(',')}"
}

char tt = 'A'
def kpiElements = [:]
matcher = regexp.matcher(formula)
while (matcher.find()) {
    def element = matcher.group(0)
    if (NumberUtils.isNumber(element.replace('(', '').replace(')', ''))) {

    } else {
        if (!kpiElements.containsKey(element)) {
            kpiElements << [(element): tt]
            tt++
        }

    }

}

def kpiAggElement = formula
def kpiElement = []
println kpiElements
kpiElements.each {k, v ->
    kpiElement << "$k as $v"
    kpiAggElement = StringUtils.replace(kpiAggElement, k.toString(), "($v)")
}
println kpiAggElement
println kpiElement.join(",")
println kpiAggElement.replaceAll('\\s*', '')

class WhereClause {

    def column
    def operator
    def value
    List values = []
    boolean bind = true
    String bindDiscriminator = ""
    static final List BIND_VALUE_FORBIDDEN_CHARS = ['(',')']

    void setValue(value){
        this.value = value
        values = [value]
    }

    Map getParms(){
        def map = [:]
        values.eachWithIndex{ it, i ->
            String bindColumn = column
            // replace forbidden chars eventually present in column
            BIND_VALUE_FORBIDDEN_CHARS.each{
                if(bindColumn.contains(it)) {
                    bindColumn = bindColumn.replace(it, '_')
                }
            }
            map.put("$bindColumn${i}_$bindDiscriminator".toString(),it)
        }
        return map
    }

    public String toString (){
        if (value) values = [value]
        def columnString = column?.toString() ?: ""
        def operatorString = operator?.toString() ?: ""
        String valuesString = ""
        if(bind){
            def list = []
            values.eachWithIndex{ it, i ->
                String bindColumn = column
                // replace forbidden chars eventually present in column
                BIND_VALUE_FORBIDDEN_CHARS.each{
                    if(bindColumn.contains(it)) {
                        bindColumn = bindColumn.replace(it, '_')
                    }
                }
                list << ":$bindColumn${i}_$bindDiscriminator".toString()
            }
            valuesString = list.join(",")
        }
        else{
            valuesString = (values.toString())[1..-2]
        }

        return "(${columnString} ${operatorString} (${valuesString}))"
    }
}

WhereClause clause = new WhereClause(bind: false)
clause.column = 'SAM'
clause.operator = "IN"
clause.values = ['1', '2']

println clause

def tt1 = [1:1, 2:2]
def tt2 = [1:1]



println tt1.intersect(tt2)