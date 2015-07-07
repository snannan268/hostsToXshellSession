import groovy.sql.Sql
import java.text.SimpleDateFormat

def result = [[id: '2_1362635_2_other', name: 'APN'],
        [id: '2_1362665_2_other', name: 'APN'],
        [id: '2_1366357_2_other', name: 'APN'],
        [id: '2_1366337_2_other', name: 'APN'],
        [id: '2_1362645_2_other', name: 'APN'],
        [id: '2_1366347_2_other', name: 'APN'],
        [id: '2_1366367_2_other', name: 'APN'],
        [id: '2_1362655_2_other', name: 'APN'],
        [id: '2003_1366507_2003_other', name: 'Call Condition'],
        [id: '2003_1366237_2003_other', name: 'Call Condition'],
        [id: '2003_1366257_2003_other', name: 'Call Condition'],
        [id: '2003_1366447_2003_other', name: 'Call Condition'],
        [id: '2003_1366457_2003_other', name: 'Call Condition'],
        [id: '2003_1366317_2003_other', name: 'Call Condition'],
        [id: '2003_1366247_2003_other', name: 'Call Condition'],
        [id: '2003_1366357_2003_other', name: 'Call Condition'],
        [id: '2003_1366347_2003_other', name: 'Call Condition'],
        [id: '2003_1366277_2003_other', name: 'Call Condition'],
        [id: '2003_1366327_2003_other', name: 'Call Condition'],
        [id: '2003_1366517_2003_other', name: 'Call Condition'],
        [id: '2003_1366497_2003_other', name: 'Call Condition'],
        [id: '2003_1366297_2003_other', name: 'Call Condition'],
        [id: '2003_1366367_2003_other', name: 'Call Condition'],
        [id: '2003_1366477_2003_other', name: 'Call Condition'],
        [id: '2003_1366267_2003_other', name: 'Call Condition'],
        [id: '2003_1366467_2003_other', name: 'Call Condition'],
        [id: '2003_1366287_2003_other', name: 'Call Condition'],
        [id: '2003_1366307_2003_other', name: 'Call Condition'],
        [id: '2003_1366337_2003_other', name: 'Call Condition'],
        [id: '2001_1362765_2001_other', name: 'Call Direction'],
        [id: '2001_1362605_2001_other', name: 'Call Direction'],
        [id: '2001_1366357_2001_other', name: 'Call Direction'],
        [id: '2001_1362455_2001_other', name: 'Call Direction'],
        [id: '2001_1362475_2001_other', name: 'Call Direction'],
        [id: '2001_1362595_2001_other', name: 'Call Direction'],
        [id: '2001_1362745_2001_other', name: 'Call Direction'],
        [id: '2001_1366327_2001_other', name: 'Call Direction'],
        [id: '2001_1366337_2001_other', name: 'Call Direction'],
        [id: '2001_1366267_2001_other', name: 'Call Direction'],
        [id: '2001_1366467_2001_other', name: 'Call Direction'],
        [id: '2001_1366287_2001_other', name: 'Call Direction'],
        [id: '2001_1362665_2001_other', name: 'Call Direction'],
        [id: '2001_1366367_2001_other', name: 'Call Direction'],
        [id: '2001_1362735_2001_other', name: 'Call Direction'],
        [id: '2001_1366257_2001_other', name: 'Call Direction'],
        [id: '2001_1366317_2001_other', name: 'Call Direction'],
        [id: '2001_1362545_2001_other', name: 'Call Direction'],
        [id: '2001_1366277_2001_other', name: 'Call Direction'],
        [id: '2001_1366237_2001_other', name: 'Call Direction'],
        [id: '2001_1362555_2001_other', name: 'Call Direction'],
        [id: '2001_1366307_2001_other', name: 'Call Direction'],
        [id: '2001_1366297_2001_other', name: 'Call Direction'],
        [id: '2001_1366477_2001_other', name: 'Call Direction'],
        [id: '2001_1362635_2001_other', name: 'Call Direction'],
        [id: '2001_1366347_2001_other', name: 'Call Direction'],
        [id: '2001_1366247_2001_other', name: 'Call Direction'],
        [id: '2001_1362585_2001_other', name: 'Call Direction'],
        [id: '2001_1362485_2001_other', name: 'Call Direction'],
        [id: '2001_1362645_2001_other', name: 'Call Direction'],
        [id: '2001_1362655_2001_other', name: 'Call Direction'],
        [id: '2001_1362515_2001_other', name: 'Call Direction'],
        [id: '2001_1362755_2001_other', name: 'Call Direction'],
        [id: '2001_1362465_2001_other', name: 'Call Direction'],
        [id: '9_1366307_9_other', name: 'Handset'],
        [id: '9_1362555_9_other', name: 'Handset'],
        [id: '9_1362485_9_other', name: 'Handset'],
        [id: '9_1362605_9_other', name: 'Handset'],
        [id: '9_1362815_9_other', name: 'Handset'],
        [id: '9_1366517_9_other', name: 'Handset'],
        [id: '9_1366327_9_other', name: 'Handset'],
        [id: '9_1366317_9_other', name: 'Handset'],
        [id: '9_1362515_9_other', name: 'Handset'],
        [id: '9_1366297_9_other', name: 'Handset'],
        [id: '60_1366257_60_node', name: 'IMS Server'],
        [id: '60_1362795_60_node', name: 'IMS Server'],
        [id: '60_1366477_60_node', name: 'IMS Server'],
        [id: '60_1366287_60_node', name: 'IMS Server'],
        [id: '60_1362605_60_node', name: 'IMS Server'],
        [id: '60_1366367_60_node', name: 'IMS Server'],
        [id: '60_1362465_60_node', name: 'IMS Server'],
        [id: '60_1362665_60_node', name: 'IMS Server'],
        [id: '60_1362765_60_node', name: 'IMS Server'],
        [id: '60_1362595_60_node', name: 'IMS Server'],
        [id: '60_1362545_60_node', name: 'IMS Server'],
        [id: '60_1366277_60_node', name: 'IMS Server'],
        [id: '60_1366327_60_node', name: 'IMS Server'],
        [id: '60_1366507_60_node', name: 'IMS Server'],
        [id: '208_1366507_208_other', name: 'Negotiated QCI'],
        [id: '208_1362815_208_other', name: 'Negotiated QCI'],
        [id: '208_1362795_208_other', name: 'Negotiated QCI'],
        [id: '208_1366517_208_other', name: 'Negotiated QCI'],
        [id: '208_1366267_208_other', name: 'Negotiated QCI'],
        [id: '208_1362455_208_other', name: 'Negotiated QCI'],
        [id: '208_1362805_208_other', name: 'Negotiated QCI'],
        [id: '208_1366497_208_other', name: 'Negotiated QCI'],
        [id: '19_1362645_19_node', name: 'PGW'],
        [id: '19_1362465_19_node', name: 'PGW'],
        [id: '19_1362585_19_node', name: 'PGW'],
        [id: '19_1366247_19_node', name: 'PGW'],
        [id: '19_1366267_19_node', name: 'PGW'],
        [id: '19_1366277_19_node', name: 'PGW'],
        [id: '19_1366447_19_node', name: 'PGW'],
        [id: '19_1362485_19_node', name: 'PGW'],
        [id: '19_1366307_19_node', name: 'PGW'],
        [id: '19_1366347_19_node', name: 'PGW'],
        [id: '19_1362455_19_node', name: 'PGW'],
        [id: '19_1362735_19_node', name: 'PGW'],
        [id: '2000_1366237_2000_other', name: 'Release Direction'],
        [id: '2000_1362745_2000_other', name: 'Release Direction'],
        [id: '2000_1366257_2000_other', name: 'Release Direction'],
        [id: '2000_1362485_2000_other', name: 'Release Direction'],
        [id: '2000_1362585_2000_other', name: 'Release Direction'],
        [id: '2000_1366357_2000_other', name: 'Release Direction'],
        [id: '2000_1366267_2000_other', name: 'Release Direction'],
        [id: '2000_1366337_2000_other', name: 'Release Direction'],
        [id: '2000_1362655_2000_other', name: 'Release Direction'],
        [id: '2000_1366477_2000_other', name: 'Release Direction'],
        [id: '2000_1362645_2000_other', name: 'Release Direction'],
        [id: '2000_1362595_2000_other', name: 'Release Direction'],
        [id: '2000_1366327_2000_other', name: 'Release Direction'],
        [id: '2000_1366347_2000_other', name: 'Release Direction'],
        [id: '2000_1362605_2000_other', name: 'Release Direction'],
        [id: '2000_1362515_2000_other', name: 'Release Direction'],
        [id: '2000_1362635_2000_other', name: 'Release Direction'],
        [id: '2000_1362475_2000_other', name: 'Release Direction'],
        [id: '2000_1362735_2000_other', name: 'Release Direction'],
        [id: '2000_1366307_2000_other', name: 'Release Direction'],
        [id: '2000_1362665_2000_other', name: 'Release Direction'],
        [id: '2000_1366317_2000_other', name: 'Release Direction'],
        [id: '2000_1366297_2000_other', name: 'Release Direction'],
        [id: '2000_1366467_2000_other', name: 'Release Direction'],
        [id: '2000_1362555_2000_other', name: 'Release Direction'],
        [id: '2000_1362765_2000_other', name: 'Release Direction'],
        [id: '2000_1366247_2000_other', name: 'Release Direction'],
        [id: '2000_1362465_2000_other', name: 'Release Direction'],
        [id: '2000_1362455_2000_other', name: 'Release Direction'],
        [id: '2000_1362545_2000_other', name: 'Release Direction'],
        [id: '2000_1366277_2000_other', name: 'Release Direction'],
        [id: '2000_1366287_2000_other', name: 'Release Direction'],
        [id: '2000_1362755_2000_other', name: 'Release Direction'],
        [id: '2000_1366367_2000_other', name: 'Release Direction'],
        [id: '207_1366517_207_other', name: 'Requested QCI'],
        [id: '207_1366507_207_other', name: 'Requested QCI'],
        [id: '207_1362795_207_other', name: 'Requested QCI'],
        [id: '207_1366267_207_other', name: 'Requested QCI'],
        [id: '207_1362805_207_other', name: 'Requested QCI'],
        [id: '207_1366497_207_other', name: 'Requested QCI'],
        [id: '207_1362455_207_other', name: 'Requested QCI'],
        [id: '207_1362815_207_other', name: 'Requested QCI'],
        [id: '20_1366267_20_node', name: 'SGW'],
        [id: '20_1366237_20_node', name: 'SGW'],
        [id: '20_1362635_20_node', name: 'SGW'],
        [id: '20_1366337_20_node', name: 'SGW'],
        [id: '20_1362475_20_node', name: 'SGW'],
        [id: '20_1366287_20_node', name: 'SGW'],
        [id: '20_1362515_20_node', name: 'SGW'],
        [id: '20_1362545_20_node', name: 'SGW'],
        [id: '20_1362745_20_node', name: 'SGW'],
        [id: '20_1362455_20_node', name: 'SGW'],
        [id: '20_1366457_20_node', name: 'SGW'],
        [id: '20_1366297_20_node', name: 'SGW'],
        [id: '137_1366447_137_other', name: 'Session Effective'],
        [id: '137_1366357_137_other', name: 'Session Effective'],
        [id: '137_1366287_137_other', name: 'Session Effective'],
        [id: '137_1366337_137_other', name: 'Session Effective'],
        [id: '137_1366327_137_other', name: 'Session Effective'],
        [id: '137_1366247_137_other', name: 'Session Effective'],
        [id: '137_1366277_137_other', name: 'Session Effective'],
        [id: '137_1366257_137_other', name: 'Session Effective'],
        [id: '137_1366307_137_other', name: 'Session Effective'],
        [id: '137_1366317_137_other', name: 'Session Effective'],
        [id: '137_1366457_137_other', name: 'Session Effective'],
        [id: '137_1366507_137_other', name: 'Session Effective'],
        [id: '137_1366347_137_other', name: 'Session Effective'],
        [id: '137_1366267_137_other', name: 'Session Effective'],
        [id: '137_1366467_137_other', name: 'Session Effective'],
        [id: '137_1366367_137_other', name: 'Session Effective'],
        [id: '137_1366237_137_other', name: 'Session Effective'],
        [id: '137_1366517_137_other', name: 'Session Effective'],
        [id: '137_1366297_137_other', name: 'Session Effective'],
        [id: '137_1366497_137_other', name: 'Session Effective'],
        [id: '137_1366477_137_other', name: 'Session Effective'],
        [id: '25_1366477_25_other', name: 'ULI'],
        [id: '25_1366457_25_other', name: 'ULI'],
        [id: '25_1366467_25_other', name: 'ULI'],
        [id: '25_1362755_25_other', name: 'ULI'],
        [id: '25_1362745_25_other', name: 'ULI'],
        [id: '25_1362765_25_other', name: 'ULI'],
        [id: '25_1362735_25_other', name: 'ULI'],
        [id: '25_1366447_25_other', name: 'ULI'],
        [id: '112_1366507_112_other', name: 'VLAN'],
        [id: '112_1366317_112_other', name: 'VLAN'],
        [id: '112_1366287_112_other', name: 'VLAN'],
        [id: '112_1366447_112_other', name: 'VLAN'],
        [id: '112_1362485_112_other', name: 'VLAN'],
        [id: '112_1362815_112_other', name: 'VLAN'],
        [id: '112_1362635_112_other', name: 'VLAN'],
        [id: '112_1366297_112_other', name: 'VLAN'],
        [id: '112_1366307_112_other', name: 'VLAN'],
        [id: '112_1366467_112_other', name: 'VLAN'],
        [id: '112_1366367_112_other', name: 'VLAN'],
        [id: '112_1366497_112_other', name: 'VLAN'],
        [id: '112_1366327_112_other', name: 'VLAN'],
        [id: '112_1362605_112_other', name: 'VLAN'],
        [id: '112_1366257_112_other', name: 'VLAN'],
        [id: '112_1362655_112_other', name: 'VLAN'],
        [id: '112_1362735_112_other', name: 'VLAN'],
        [id: '112_1362585_112_other', name: 'VLAN'],
        [id: '112_1362645_112_other', name: 'VLAN'],
        [id: '112_1362455_112_other', name: 'VLAN'],
        [id: '112_1362755_112_other', name: 'VLAN'],
        [id: '112_1366337_112_other', name: 'VLAN'],
        [id: '112_1362475_112_other', name: 'VLAN'],
        [id: '112_1366357_112_other', name: 'VLAN'],
        [id: '112_1362595_112_other', name: 'VLAN'],
        [id: '112_1366277_112_other', name: 'VLAN'],
        [id: '112_1366477_112_other', name: 'VLAN'],
        [id: '112_1362515_112_other', name: 'VLAN'],
        [id: '112_1366267_112_other', name: 'VLAN'],
        [id: '112_1362465_112_other', name: 'VLAN'],
        [id: '112_1362765_112_other', name: 'VLAN'],
        [id: '112_1366517_112_other', name: 'VLAN'],
        [id: '112_1362555_112_other', name: 'VLAN'],
        [id: '112_1366247_112_other', name: 'VLAN'],
        [id: '112_1362745_112_other', name: 'VLAN'],
        [id: '112_1362795_112_other', name: 'VLAN'],
        [id: '112_1362805_112_other', name: 'VLAN'],
        [id: '112_1362545_112_other', name: 'VLAN'],
        [id: '112_1366347_112_other', name: 'VLAN'],
        [id: '112_1366237_112_other', name: 'VLAN'],
        [id: '112_1366457_112_other', name: 'VLAN'],
        [id: '112_1362665_112_other', name: 'VLAN'],
        [id: '21_1366247_21_node', name: 'eNodeB'],
        [id: '21_1362755_21_node', name: 'eNodeB'],
        [id: '21_1362475_21_node', name: 'eNodeB'],
        [id: '21_1366497_21_node', name: 'eNodeB'],
        [id: '21_1366237_21_node', name: 'eNodeB'],
        [id: '21_1362585_21_node', name: 'eNodeB'],
        [id: '21_1366357_21_node', name: 'eNodeB'],
        [id: '21_1366317_21_node', name: 'eNodeB'],
        [id: '21_1366467_21_node', name: 'eNodeB'],
        [id: '21_1366257_21_node', name: 'eNodeB'],
        [id: '21_1362805_21_node', name: 'eNodeB'],
        [id: '21_1362595_21_node', name: 'eNodeB'],
        [id: '21_1362555_21_node', name: 'eNodeB'],
        [id: '21_1362655_21_node', name: 'eNodeB']]

def map = [:]

private def convertDynamicDimensionTypeIdToMap(String str, name) {
    def result = [:]
    def token = str.tokenize('_')
    result << [tableId: token[1], virtDimId: token[0], dimId: token[2], type: token[3], name: name]
}

def afterConvertResult = []

result.each {
    afterConvertResult << convertDynamicDimensionTypeIdToMap(it.id, it.name)
}

def dimensions = ['2', '2001']

println afterConvertResult.groupBy {
    it.tableId
}.findAll {
    println "tableId: " + it.key
    (it.value.collect {it.dimId} as Set).containsAll(dimensions)
}.collect {k, v ->
    v.collect {
        [id: it.dimId, name: it.name]
    }
}.flatten().unique().findAll {
    !dimensions.contains(it.id)
}

//def DYNAMIC_FILTER_PATTERN = ~/(\d+)-dynamicFilter-(\d+)/
//String pattern = '(\\d+)-dynamicFilter-(\\d+)'
//String value = '1013-dynamicFilter-1'
//println value.matches(pattern)
//println((~pattern).matcher('1013-dynamicFilter-1').find())

def tt = [[id: 1, name: 'haha'], [id: 100, name: 'tt'], [id: 3, name: 'san'], [id: 2, name: 'er']]
def nodeGroupTypeDimensions = []
def maxIndex = tt.findIndexValues {
    nodeGroupTypeDimensions.contains(it.id)
}.max() ?: -1
println tt[0..-2]
println(tt - tt[0..maxIndex])

def haha = [1, 2, 3]
println(haha.getClass().isArray() || haha instanceof List)

def testArray = [[name: 'Call Attempts', id: 12], [name: 'SIP Call Attempts', id: 1], [name: 'RTP Call Attempts', id: 2]]
println([name: 'Call Attempts', id: 12].remove('id'))
/*


Sql sql = Sql.newInstance('jdbc:oracle:thin:@satosa:1521:iris', 'irisowner', 'iris', 'oracle.jdbc.driver.OracleDriver')

sql.eachRow('select t.*, rownum R from conf_direction t'){row->
    def map11 = (row.toRowResult() as Map)
//    println "remove ${map11.remove('r')}"
    println "${map11.values()}"
}
*/

private String calToString(Calendar cal) {
    def outputDateFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    outputDateFmt.setTimeZone(TimeZone.getTimeZone('UTC'))
    def output = outputDateFmt.format(cal.getTime())
    return output.toString()
}

Calendar fromCal = Calendar.getInstance()
fromCal.setTimeZone(TimeZone.getTimeZone('UTC'))
fromCal.setTimeInMillis(1427864400000)

Calendar fromCal1 = Calendar.getInstance()
fromCal1.setTimeInMillis(1432684800000)
fromCal1.setTimeZone(TimeZone.getTimeZone('UTC'))

println calToString(fromCal)
println calToString(fromCal1)

def hahaaa = (1..20).collect {[id: it, name: it]}
println hahaaa

int selectedChartSeries = 0
int topN = 2

if (selectedChartSeries ?: selectedChartSeries > topN) {
    println true
}


def dashletSeriesItems = []

def resultTest = [[rowNumber: 2, name: '1_B'], [rowNumber: 1, name: '1_A'], [rowNumber: 1, name: '1_E'], [rowNumber: 1, name: '1_D']]

def getDimName(String value, def isItem = false) {
    if (!value) {
        return ""
    }
    if (value.count('_') > 0) {
        int firstIndex = value.indexOf('_')
        int secondIndex = value.indexOf('_', firstIndex + 1)
        if (!isItem) {
            return value.substring(secondIndex + 1, value.length())
        }
        else {
            return value.substring(firstIndex + 1, value.length())
        }
    } else {
        return value
    }
}

println resultTest.sort {a, b ->
    def temp = (a.rowNumber <=> b.rowNumber)
    println "${a.rowNumber} <=> ${b.rowNumber}, $temp"
    if (temp == 0) {
        temp = (getDimName(a.name, true) <=> getDimName(b.name, true))
    }
    return temp
}

//The specific dimension type id
 String DDRA_ID = "116"
 String SDRA_ID = "115"
 String DN_ID = "27"
 String SN_ID = "26"
 String SVRN_ID = "135"
 String CGI_ID = "14"
 String ENB_ID = "21"
 String ULI_ID = "25"
 String HOP_ID = "2004"
 String SAI_ID = "31"

//Cause those dimensions are NOT really dimension. The value is NOT a number.
def  AF_SPECIFIC_DIMENSIONS = [CGI_ID, ULI_ID, SAI_ID]

def tttt= '31'

println (tttt in AF_SPECIFIC_DIMENSIONS)

