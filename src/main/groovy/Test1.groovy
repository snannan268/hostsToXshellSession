import org.apache.commons.lang.math.NumberUtils
import org.codehaus.groovy.runtime.ArrayUtil

/**
 * Need get the value for the request parameters
 * @param value such as: 48_Gm(IMS) 49_Gm(S1-U)
 * @return 48 49, if don't have some number type will return null
 */
private def getValue(String value) {
    def valueNeedConvert = value
    long result = 0L
    if (valueNeedConvert.contains('_')) {
        valueNeedConvert = value.tokenize('_')[0]
    }

    if (NumberUtils.isNumber(valueNeedConvert)) {
        result = NumberUtils.toLong(valueNeedConvert)
    } else {
        return null
    }

    return result
}

private def getValue(Long value){
    return value
}

private def getValue(List list) {
    def resultList = []
    list.each {
        resultList << getValue(it)
    }
    return resultList
}

println getValue('48_Gm(IMS)')
println getValue('49_Gm(S1-U)')
def tt = ['48_Gm(IMS)', '49_Gm(S1-U)']
println getValue(tt)

println '123456'.toList()

def testArray = [[[id: 1], [id: 3, name: 'sam']], [[id: 2], [id: 3, name: 'sam']], [[id: 3, name: 'sam'], [id: 4], [id: 5], [id: 6]]]

def totalArray = testArray.flatten()
println totalArray
testArray.each {
    totalArray = totalArray.intersect(it)
}

def finalKpiAggElement = 'sum(A)/(sum(B))/ sum(C))'
def havingMinSamplesKpiClause = []
if (finalKpiAggElement.contains('/')) {
    int i = 0
    for (element in finalKpiAggElement.tokenize('/')) {
        if (i++ != 0) {
            for (int t = (element.count('(') - element.count(')')); t > 0; t--) {
                element -= '('
            }
            for (int t = (element.count(')') - element.count('(')); t > 0; t--) {
                element -= ')'
            }
            havingMinSamplesKpiClause << "$element > 0"
        }
    }
}
def dividendZeroControl = havingMinSamplesKpiClause ? " HAVING ${havingMinSamplesKpiClause.join(' AND ')}" : ''
println dividendZeroControl

private def getKPIsWithParams(param) {
    def kpiList = []
    param.each {k, v ->
        if (k.matches((~/protocol-items-(\d+)/))) {
            kpiList << getValue(v)
        }
    }
    return kpiList.flatten()
}

def param = ['protocol-items-1': ['1_hah', '2_tt', '3_xx']]

println getKPIsWithParams(param)

/**
 * Convert the id to only keep the dimension type
 * @param map [id:'9_79420_9_other', name: 'Handset']
 *
 * with return [id:'9', name: 'Handset']
 */
def convertDynDimTypeKeyCache(Map map) {
    if (map?.id) {
        map.id = getValue(map.id) + 1
    }
    return map
}

def convertDynDimTypeKeyCache(List list) {
    list.each {
        convertDynDimTypeKeyCache(it)
    }
    return list.unique()
}

println(convertDynDimTypeKeyCache([[id: 1, name: 'haha'], [id: 2, name: 'Test']]) + [[id: 3, name: 'haha']])

def str = "DIM_208_Negotiated QCI"

str.count("_")

int firstIndex = str.indexOf('_')
int secondIndex = str.indexOf('_', firstIndex+1)

println str.substring(0, secondIndex)
