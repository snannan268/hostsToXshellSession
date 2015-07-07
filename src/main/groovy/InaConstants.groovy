/**
 * Class gathering all common contsants of I-pi application
 *
 */
public class InaConstants{

    public static final Long IPI_APP_ID = 1

    // Url parameter keys
    public static final String APP_ID_PARM = "appId"
    public static final String RESOLUTION_PARM = "resolution"
    public static final String FROMTIME_PARM = "fromTime"
    public static final String TOTIME_PARM = "toTime"
    public static final String TIMEZONE_OFFSET = "tzoffset"
    public static final String FROMTIME_TIMEZONE_OFFSET = "fromTimeTZOffset"
    public static final String TOTIME_TIMEZONE_OFFSET = "toTimeTZOffset"
    public static final String SERVICE_PARM = "service"
    public static final String SA_SERVICE_PARM = "sa-service"
    public static final String CATEGORY_PARM = "category"
    public static final String KQI_PARM = "kqi"
    public static final String KPI_PARM = "kpi"
    public static final String TREND_KPI_PARM = "trendKpi"
    public static final String TEMPLATE_NAME_PARM = "templateName"
    public static final String DIMENSION_TYPE_PARM = 'dimensionType'
    public static final String SECONDARY_DIMENSION_TYPE_PARM = 'secondaryDimensionType'
    public static final String SA_DIMENSION_TYPE_PARM = 'sa-dimensionType'
    public static final String VIRTUAL_DIM_TYPE_PARM = 'virtualDimensionType'
    public static final String VIRTUAL_DIM_COND_FIELD_PARM = 'vDimConditionField'
    public static final String VIRTUAL_DIM_COND_VAL_PARM = 'vDimConditionVal'
    public static final String DIMENSION_PARM = 'dimension'
    public static final String UNPROV_DIMENSION_PARM = 'dimension-unprovisioned'
    public static final String SA_DIMENSION_PARM = 'sa-dimension'
    public static final String SA_UNPROV_DIMENSION_PARM = 'sa-dimension-unprovisioned'
    public static final String SECONDARY_DIMENSION_PARM = 'secondaryDimension'
    public static final String UNPROV_SECONDARY_DIMENSION_PARM = 'secondaryDimension-unprovisioned'
    public static final String SA_GROUP_PARM = 'sa-group'
    public static final String NODE_DIMENSION_PARM = 'nodeDimension'
    public static final String NODE_DIMENSIONTYPE_PARM = 'nodeDimensionType'
    public static final String NODE_DIMENSIONTYPE_WITHWILDCARD_PARM = 'nodeDimensionTypeWithWildcard'
    public static final String INTERFACETYPE_PARM = "interfaceType"
    public static final String PROTOCOL_PARM = "protocol"
    public static final String RCA_PROTOCOL_PARM = "rcaProtocol"
    public static final String NETWORKVIEW_PARM = "networkView"
    public static final String SELECTEDTIME_PARM = "selectedTime"
    public static final String RC_PARM = "rc"
    public static final String PROCEDURE_PARM = "procedure"
    public static final String PROCEDURE_ATTRIBUTE_PARM = "attribute"
    public static final String RCC_PARM = "rcc"
    public static final String RC_SUCCESS_FLAG_PARM = "successFlag"
    public static final String KPI_PROTOCOL_PARM = "kpiProtocol"
    public static final String ALARMED_KPIS_PARM = "alarmedKpis"
    public static final String NODE_GROUP_TYPE_PARM = "nodeGroupType"
    public static final String NODE_GROUP_PARM = "nodeGroup"
    public static final String GROUP_TYPE_PARM = "groupType"
    public static final String GROUP_PARM = "group"
    public static final String GROUP_DIMENSION_TYPE_PARM = "groupDimensionType"
    public static final String GROUP_TYPE_DIMENSION_TYPE_PARM = "groupTypeDimensionType"
    public static final String DIM_TYPE_DISPLAY_NAME_PARM = "dimTypeDisplayName"
    public static final String FILTER_TYPE = "cdrFilterType"
    public static final String FILTER_VALUE = "cdrFilterValue"
    public static final String NODE_EXPRESSION_PARM = 'nodeExpression'
    public static final String MIN_SAMPLES_PARM = 'minSamples'
    public static final String DIM_EXPRESSION_PARM = 'dimExpression'
    public static final String FAILURE_KPI_PARM = "failureKpi"
    public static final String NODE_DIMENSION_WITHWILDCARD_PARM = 'nodeDimensionWithWildcard'
    public static final String RC_PROTOCOL_PARM = "rcProtocol"
    public static final String RSPCODE_PARM = "rspcode"
    public static final String RCCATEGORY_PARM = "rcCategory"
    public static final String CONTROL_PLANE_PROTOCOL_PARM = "controlPlaneProtocol"
    public static final String NODE_DIMENSIONTYPE_CTRL_PLANE_PARM = 'ctrlPlaneNodeDimensionType'
    public static final String VIEW_OPTIONS_SELECTED = 'viewOptionsSelected'
    public static final String RC_SUCCESS_FAILURE_PARM = 'causeType'
    public static final String RC_DIST_DISPLAY_PARM = 'rcDistDisplayName'
    public static final String ALARM_PROFILE_PARAM = 'alarmProfile'
    public static final String ALARM_CLEARED_PARAM = 'alarmCleared'
    public static final String ALARM_ACKNOWLEDGED_PARAM = 'alarmAcknowleged'
    public static final String KPI_DIST_PARM = 'kpiDistribution'
    public static final String RCA_NODE_EXPRESSION_PARM = 'rca-nodeExpression'
    public static final String RCA_NODE_DIMENSIONTYPE_PARM = 'rca-nodeDimensionType'
    public static final String RCA_NODE_GROUP_TYPE_PARM = "rca-nodeGroupTypeWithNDimType"
    public static final String RCA_NODE_GROUP_PARM = "rca-nodeGroup"
    public static final String RCC_IN_PROTOCOL_PARAM = "rccInProtocol"
    public static final String RC_IN_PROTOCOL_PARAM = "rcInProtocol"
    public static final String RCA_DETAILED_PARAM = "isRcaDetailedBoard"
    public static final String DIM_TYPE_N_SERIES_PARAM = "dimensionTypeNSeries"
    public static final String DIM_PARAM_TYPE = "dimParamType"
    public static final String RC_PERIOD_SELECTION_PARAM = "rcPeriodSelected"
    public static final String RC_LEGNED_SELECTED_PARAM = "rcLegendSelected"
    public static final String RCA_LANDING_DATAAVAILABLE_PARAM = "dataAvailable"
    public static final String PNA_TREND_NODE_TYPE = "pna-nodeDimensionType"
    public static final String PNA_NODE_GROUP_PARM = "pna-nodeGroup"
    public static final String UNSUPPORT_DIM_TYPE_MSG = "unSupDimTypeMsg"

    public static final String DYNAMIC_NODEGROUP = "nodeGroupWithType"

    //AF constant defined start
    public static final String AF_DASHBOARD_NAME = "auto-focus"
    public static final String AF_PRIVILEGE = 'ROLE_IPI_AUTOFOCUS'

    //AF filters defined for GUI filter get options
    public static final def AF_REQUEST_FILTER_NAME = 'filterName'
    public static final def AF_SOURCE_FILTER = 'source-filter'
    public static final def AF_SOURCE_ITEMS= 'source-items'
    public static final def AF_PROTOCOL_FILTER = 'protocol-filter-'
    public static final def AF_PROTOCOL_ITEMS = 'protocol-items-'
    public static final def AF_DASHLET_ITEM = 'dashlet-items'
    public static final def AF_DASHLET_SERIES = 'dashlet-series'
    public static final def AF_CHART_SERIES = 'chart-series'
    public static final def AF_CHART_ITEM = 'chart-items'


    public static final def AF_DYNAMIC_DIMENSION_KEY_WORD = '-dynamicFilter-'
    public static final def AF_DYNAMIC_DIMENSION_ITEMS_KEY_WORD = '-dynamicFilterValue-'

    public static final def AF_DYNAMIC_DIMENSION_ALL  = [[id:WILDCARD_VALUE, name: WILDCARD_VALUE_STRING]]


    public static final def AF_PROTOCOL_FILTER_PATTERN = ~/protocol-filter-(\d+)/
    public static final def AF_COMMON_KPI_FILTER_PATTERN = ~/protocol-items-(\d+)/

    public static final def AF_DYNAMIC_FILTER_PATTERN = ~/-(\d+)/
    public static final def AF_DYNAMIC_FILTER_DEFAULT_INDEX = '-1'


    //AF filters defined for get data request begin


    public static final String SOURCES_FILTER = "sourcesFilter"
    public static final String SOURCES_HOP = AF_DIMENSION_TYPE + HOP_ID
    public static final String SOURCES_HOP_NAME = "Hop"
    public static final String SOURCES_INTERFACE = "INT_1"
    public static final String SOURCES_INTERFACE_NAME = "Interface"
    public static final String SOURCES_ITEMS = "sourcesItems"
    public static final String DASHLET_SERIES = "dashletSeries"
    public static final String DASHLET_SERIES_ITEMS = "dashletSeriesItems"
    public static final String CHART_SERIES = "chartSeries"
    public static final String CHART_SERIES_ITEMS = "chartSeriesItems"
    public static final String COMMON_KPI = "commonKpi"
    public static final String DEBUG = "debug"
    public static final String TOP_N = "topN"


    public static final def DYNAMIC_FILTER_PATTERN = ~/(\d+)-dynamicFilter-(\d+)/
    public static final String DYNAMIC_FILTER_VALUE_KEY_WORD = "-dynamicFilterValue-"

    public static final String FILTERS_PER_PROTOCOL = "filtersPerInt"
    public static final String MULTIPLE_SELECT_TOKEN = ','
    public static final String KPI_SET = "kpiSet"

    public static final String AF_DIMENSION_TYPE = "DIM_"
    public static final String AF_DIMENSION_KPI = "KPI_"
    public static final String AF_DIMENSION_INTERFACE = "INT_"
    public static final String AF_DIMENSION_NODE_GROUP_TYPE = "NGT_" //Node group type dimension for Series Selection/Dimension Filters

    public static final String DASHLET_SERIES_KPI = "KPI_1"
    public static final String DASHLET_SERIES_KPI_NAME = "KPI"
    public static final def AF_DASHLET_SERIES_KPI = [[id: DASHLET_SERIES_KPI, name: DASHLET_SERIES_KPI_NAME]]
    public static final def AF_DASHLET_SERIES_INTERFACE = [[id: SOURCES_INTERFACE, name: SOURCES_INTERFACE_NAME]]
    public static final def AF_DASHLET_SERIES_HOP = [[id: AF_DIMENSION_TYPE + HOP_ID, name: SOURCES_HOP_NAME]]

    public static final String KEY_CACHE_NODE_TYPE_DIMENSION_MAPPING = "nodeTypeDimensionMapping"

    public static final String CONF_NODE_GROUP_VIEW = "CONF_NODE_GROUP_VIEW"


    //AF pList
    public static final String AF_PLIST_ALLOW_SOURCE_SELECTED = "afAllowedInterfaceHop"
    public static final String AF_PLIST_MAX_TOP_N = "maxAfTopN"
    public static final String AF_PLIST_MAX_DASHLET_SERIES = "maxAfDashletSeries"

    //AF filters defined end

    //AF dashlet window default layout
    public static final int AF_DASHLET_DEFAULT_WIDTH = 450
    public static final int AF_DASHLET_DEFAULT_HEIGHT = 300
    public static final int AF_DASHLET_DEFAULT_SPACE = 5

    //AF constant defined end

    //
    public static final String VIEW_TYPE_KPI_KQI = "viewTypeKpi"
    public static final String VIEW_TYPE_RC = "viewTypeRc"
    //the param values (wildcards, N/A...)
    public static final String WILDCARD_VALUE = "-1"
    public static final String WILDCARD_VALUE_STRING = "All"
    public static final String NA_VALUE = "-2"
    public static final String NA_VALUE_STRING = "N/A"
    public static final String EMPTY_VALUE_STRING = ''
    public static final String BOOLEAN_VALUE_YES = "Yes"
    public static final String BOOLEAN_VALUE_NO = "No"
    public static final String NETWORK_VIEW_CONTROL_PLANE = "1"
    public static final String NETWORK_VIEW_USER_PLANE = "2"
    public static final String SORT_ORDER_ASC = "ASC"
    public static final String SORT_ORDER_DESC = "DESC"
    public static final String REGEX_CONNECTOR_UNDERLINE = "\\_" //underline
    public static final String CONNECTOR_UNDERLINE = '_'
    public static final String COLON = ':'
    public static final String MORE_WILDCARD = "*"
    public static final String SINGLE_WILDCARD = "?"
    public static final char MORE_CHARACTERS_WILDCARD = '*'
    public static final char SINGLE_CHARACTER_WILDCARD = '?'

    //key to the locale file for dist and dist category display name
    public static final String RC_FLAG_SUCCESS_VALUE = '1'
    public static final String RC_FLAG_FAILURES_VALUE = '0'
    public static final String RC_FLAG_TIMEOUTS_VALUE = '-2'
    public static final String RC_FLAG_ALL_VALUE = '-1'
    public static final String RC_FLAG_SUCCESS_KEY = 'success_distribution'
    public static final String RC_FLAG_FAILURES_KEY = 'failures_distribution'
    public static final String RC_FLAG_TIMEOUT_KEY = 'timeout_distribution'
    public static final String RC_FLAG_ALL_KEY = 'all_distribution'
    public static final String RC_FLAG_SUCCESS_CATEGORY_KEY = 'success_distribution_category'
    public static final String RC_FLAG_FAILURES_CATEGORY_KEY = 'failures_distribution_category'
    public static final String RC_FLAG_TIMEOUT_CATEGORY_KEY = 'timeout_distribution_category'
    public static final String RC_FLAG_ALL_CATEGORY_KEY = 'all_distribution_category'

    public static final String DIM_PARAM_EXP_TYPE = "dimExp"
    public static final String DIM_PARAM_ID_TYPE = "dimId"

    // The 'Unknown' element
    public static final String ELEMENT_UNKNOWN = "Unknown"
    public static final int ELEMENT_UNKNOWN_ID = -1

    // The 'Other' element
    public static final String ELEMENT_OTHER = "Others"
    public static final String ELEMENT_OTHER_ID = "-99999"
    public static final String OVERALL_RC_ID = "-99:-99"

    //The specific dimension type id
    public static final String DDRA_ID = "116"
    public static final String SDRA_ID = "115"
    public static final String DN_ID = "27"
    public static final String SN_ID = "26"
    public static final String SVRN_ID = "135"
    public static final String CGI_ID = "14"
    public static final String ENB_ID = "21"
    public static final String ULI_ID = "25"
    public static final String HOP_ID = "2004"
    public static final String SAI_ID = "31"

    //Cause those dimensions are NOT really dimension. The value is NOT a number.
    public static final def AF_SPECIFIC_DIMENSIONS = [CGI_ID, ULI_ID, SAI_ID]

    // Related to the table 'conf_response_code_category', record (2, Successful)
    public static final String RCC_SUCCESSFUL_ID = "2"

    // Dashboard Type
    public static final String DASHBOARD_TYPE_LANDING = "LANDING"

    // Dashboard supported templates
    public static final String DASHBOARD_TEMPLATE_SA_ALARM = "sa-alarms"
    public static final String DASHBOARD_TEMPLATE_SA_SERVICE = "sa-service-analysis"
    public static final String DASHBOARD_TEMPLATE_SA_PERFORMANCE_KPI = "sa-performance-kpi"
    public static final String DASHBOARD_TEMPLATE_SA_PERFORMANCE_KQI = "sa-performance-kqi"
    public static final String DASHBOARD_TEMPLATE_NA_NETWORK = "na-network"
    public static final String DASHBOARD_TEMPLATE_NA_NETWORK_ELEMENT = "na-network-element"
    public static final String DASHBOARD_TEMPLATE_NA_NETWORK_ELEMENT_KPI = "na-network-element-kpi"
    public static final String DASHBOARD_TEMPLATE_NA_NETWORK_ELEMENT_KPI_RC = "na-network-element-kpi-rc"
    public static final String DASHBOARD_TEMPLATE_NA_NETWORK_ELEM_GROUP_KPI_RC = "na-network-element-group-kpi-rc"
    public static final String DASHBOARD_TEMPLATE_FAILURE_RC = "failure-rc"
    public static final String DASHBOARD_TEMPLATE_CAUSE_CODE_ANALYSIS = "rc-Analysis"
    public static final String DASHBOARD_TEMPLATE_CAUSE_CODE_ANALYSIS_DETAIL = "rc-Analysis-Detail"
    public static final String DASHBOARD_TEMPLATE_RCA_CDRLOG = "rca-cdrLog"
    public static final String DASHBOARD_TEMPLATE_CDRLOG = "cdrLog"
    public static final String DASHBOARD_TEMPLATE_GA_NETWORK = "ga-network"
    public static final String DASHBOARD_TEMPLATE_GA_NETWORK_ELEMENT = "ga-network-element"
    public static final String DASHBOARD_TEMPLATE_GA_NETWORK_ELEMENT_KPI = "ga-network-element-kpi"
    public static final String DASHBOARD_TEMPLATE_GA_NETWORK_ELEMENT_KPI_RC = "ga-network-element-kpi-rc"
    public static final String DASHBOARD_TEMPLATE_GA_CDRLOG = "ga-cdrLog"
    public static final String DASHBOARD_TEMPLATE_EA_ELEMENT = "ea-element"
    public static final String DASHBOARD_TEMPLATE_EA_NETWORK_ELEMENT_KPI = "ea-network-element-kpi"
    public static final String DASHBOARD_TEMPLATE_EA_NETWORK_ELEMENT_KPI_RC = "ea-network-element-kpi-rc"
    public static final String DASHBOARD_TEMPLATE_EA_NETWORK_ELEMENT_KPI_RC_SECDIM = "ea-network-element-kpi-rc-secDim"
    public static final String DASHBOARD_WORKFLOW_SEPARATOR = '-'
    public static final String DASHBOARD_TEMPLATE_NA_CDRLOG = "na-cdrLog"
    public static final String DASHBOARD_TEMPLATE_NA_CDRLOG_GROUP = "na-cdrLog-group"

    // Dashlet supported template names
    public static final String DASHLET_TEMPLATE_SA_ALARM = "sa-alarmLanding"
    public static final String DASHLET_TEMPLATE_SA_TREND_ANALYSIS_KPI = "sa-trendAnalysis-kpi"
    public static final String DASHLET_TEMPLATE_SA_TREND_ANALYSIS_KQI = "sa-trendAnalysis-kqi"
    public static final String DASHLET_TEMPLATE_SA_TREND_ANALYSIS_KPI_ALL = "sa-trendAnalysis-kpi-all"
    public static final String DASHLET_TEMPLATE_SA_TREND_LDV_ANALYSIS_KPI = "sa-ldvTrendAnalysis-kpi"
    public static final String DASHLET_TEMPLATE_SA_TREND_CAUSE_KPI = "sa-trendCause-kpi"
    public static final String DASHLET_TEMPLATE_NA_TREND_VOL = "na-trendVolume-kpi"
    public static final String DASHLET_TEMPLATE_NA_WORSTN = "na-worstNSeries"
    public static final String DASHLET_TEMPLATE_NA_WORSTN_VDIM = "na-worstNSeries-vDim"
    public static final String DASHLET_TEMPLATE_NA_TREND_VOL_ELEMENT = "na-trendVolume-element"
    public static final String DASHLET_TEMPLATE_NA_TREND_VOL_ELEMENT_KPI = "na-trendVolume-element-kpi"
    public static final String DASHLET_TEMPLATE_NA_WORSTN_VDIM_ELEMENT_KPI = "na-worstNSeries-vDim-element-kpi"
    public static final String DASHLET_TEMPLATE_NA_WORSTN_ELEMENT_KPI = "na-worstNSeries-element-kpi"
    public static final String DASHLET_TEMPLATE_NA_WORSTN_ELEM_GROUP_KPI = "na-worstNSeries-element-group-kpi"
    public static final String DASHLET_TEMPLATE_NA_TREND_CAUSE_KPI = "na-trendCause-kpi"
    public static final String DASHLET_TEMPLATE_CDRLOG = "cdrLog"
    public static final String DASHLET_TEMPLATE_GA_TREND_VOL = "ga-trendVolume-kpi"
    public static final String DASHLET_TEMPLATE_GA_WORSTN = "ga-worstNSeries"
    public static final String DASHLET_TEMPLATE_GA_TREND_VOL_ELEMENT = "ga-trendVolume-element"
    public static final String DASHLET_TEMPLATE_GA_TREND_VOL_ELEMENT_KPI = "ga-trendVolume-element-kpi"
    public static final String DASHLET_TEMPLATE_GA_WORSTN_VDIM_ELEMENT_KPI = "ga-worstNSeries-vDim-element-kpi"
    public static final String DASHLET_TEMPLATE_GA_WORSTN_ELEMENT_KPI = "ga-worstNSeries-element-kpi"
    public static final String DASHLET_TEMPLATE_GA_TREND_CAUSE_KPI = "ga-trendCause-kpi"
    public static final String DASHLET_TEMPLATE_GA_CDRLOG = "ga-cdrLog"
    public static final String DASHLET_TEMPLATE_LANDING_CDRLOG = "landing-cdrLog"
    public static final String DASHLET_TEMPLATE_EA_TREND_VOL = "ea-trendVolume-kpi"
    public static final String DASHLET_TEMPLATE_EA_WORSTN = "ea-worstNSeries"
    public static final String DASHLET_TEMPLATE_EA_WORSTN_VDIM = "ea-worstNSeries-vDim"
    public static final String DASHLET_TEMPLATE_EA_TREND_CAUSE_KPI = "ea-trendCause-kpi"
    public static final String DASHLET_TEMPLATE_EA_CDRLOG = "ea-cdrLog"
    public static final String DASHLET_TEMPLATE_EA_WORSTN_ELEMENT_KPI = "ea-worstNSeries-element-kpi"
    public static final String DASHLET_TEMPLATE_EA_TREND_VOL_ELEMENT_KPI =     "ea-trendVolume-element-kpi"
    public static final String DASHLET_TEMPLATE_EA_WORSTN_VDIM_ELEMENT_KPI = "ea-worstNSeries-vDim-element-kpi"
    public static final String DASHLET_TEMPLATE_EA_TREND_CAUSE_KPI_SECDIM = "ea-trendCause-kpi-secDim"
    public static final String DASHLET_TEMPLATE_EA_CDRLOG_SECDIM = "ea-cdrLog-secDim"
    public static final String DASHLET_TEMPLATE_RCA_TREND_VOL = "rcAnalysisLanding"
    public static final String DASHLET_TEMPLATE_RCA_TREND_VOL_TITLE = "Cause Code Analysis"
    public static final String DASHLET_TEMPLATE_RCA_WORSTN = "rcAnalysisTopNSeries"
    public static final String DASHLET_TEMPLATE_RCA_WORSTN_VDIM = "rcAnalysisTopNSeries-vDim"
    public static final String DASHLET_TEMPLATE_RCA_LEGEND_TABLE = "rcAnalysisLegendTable"
    public static final String DASHLET_TEMPLATE_RCA_LEGEND_TABLE_TITLE = "CCA Legend Table"
    public static final String DASHLET_TEMPLATE_RCA_CDRLOG = "rca-cdrLog"
    public static final String DASHLET_LDV_LABEL = "LDV"
    public static final String DASHLET_TEMPLATE_NA_CDRLOG = "na-cdrLog"
    public static final String DASHLET_TEMPLATE_NA_TREND_CAUSE_GROUP = "na-trendCause-kpi-group"

    // Dashlet position offset
    public static final int DASHLET_OFFSET_POS = 4

    // DR LOG COLUMN TYPES
    public static final String DRLOG_COLUMN_TYPE_BOOLEAN = "boolean"
    public static final String DRLOG_COLUMN_TYPE_YESNO = "yesno"
    public static final String DRLOG_COLUMN_TYPE_STRING = "string"
    public static final String DRLOG_COLUMN_TYPE_DATETIME = "datetime"

    //ISA Drill Columns
    public static final String DRLOG_EQUIPMENT_ID = "EQUIPMENT_ID"
    public static final String DRLOG_BLADE_ID = "BLADE_ID"
    public static final String DRLOG_PROCESSOR_ID = "PROCESSOR_ID"
    public static final String DRLOG_CALLNUMBER_HIGH = "CALLNUMBERHIGH"
    public static final String DRLOG_CALLNUMBER = "CALLNUMBER"
    public static final String DRLOG_STARTTIME = "STARTTIME"
    public static final String DRLOG_ENDTIME = "ENDTIME"
    public static final String START_TIME_LABEL = "START"

    //QCI  DRLOG  COLUMN
    public static final List<String> DRLOG_QCICOLUMNS = ["ReqMBRUL","ReqMBRDL","ReqGBRUL","ReqGBRDL","NegMBRUL","NegMBRDL","NegGBRUL","NegGBRDL"]

    //ISA Drill Field Names to Pass
    public static final String DRLOG_FN_PROBE_ID = "probeId";
    public static final String DRLOG_FN_BLADE_ID = "bladeId";
    public static final String DRLOG_FN_PROCESSOR_ID = "processorId";
    public static final String DRLOG_FN_CALLNUMBER = "callNumber";
    public static final String DRLOG_FN_STARTTIME = "startTime";
    public static final String DRLOG_FN_ENDTIME = "endTime";
    public static final String DRLOG_TIME_FORMAT="yyyy/MM/dd HH:mm:ss";
    public static final String DRLOG_TIME_SQL_FORMAT="yyyy/MM/dd HH24:mi:ss"
    public static final String DB_TIME_0 = '1970/1/1'
    public static final String DRLOG_ISA_TIME_FORMAT="yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public static final String DRLOG_FN_RECORD_ID = "recordId"
    public static final String DRLOG_FN_MPC_RULESET = "mpcRuleSetNames"
    public static final List DRLOG_DRILL_PARAMETERS = [
            "searchTarget=ACTIVE",
            "timeTarget=MONITORING",
            "workflowName=Session%20Analysis",
            "autoStart=true"
    ]

    //DIMENSION KEY ATTRIBUTE
    public static final String DIM_ATTR_INTERFACE_ID = "INTF_ID"
    public static final String DIM_ATTR_PROTOCOL_ID = "PROT_ID"
    public static final String DIM_ATTR_PROCEDURE_ID = "PROC_ID"

    // key cache keys
    public static final String KEY_CACHE_INTERFACETYPE = "interfaceType"
    public static final String KEY_CACHE_AF_INTERFACE_TYPE = "afInterfaceType"
    public static final String KEY_CACHE_AF_PROTOCOL = "afProtocol"
    public static final String KEY_CACHE_AF_COMMON_KPI = "afCommonKpi"
    public static final String KEY_CACHE_AF_SOURCES_FILTER = "sourcesFilter"
    public static final String KEY_CACHE_AF_SOURCES_VALUE = "sourcesValue"

    public static final String KEY_CACHE_CATEGORY = "qosCategories"
    public static final String KEY_CACHE_KPI = "kpi"
    public static final String KEY_CACHE_KQI = "kqi"
    public static final String KEY_CACHE_KPI_PROTOCOL = "kpiProtocol"
    public static final String KEY_CACHE_INTERFACE_TYPE = "interfaceType"
    public static final String KEY_CACHE_PROCEDURE = "procedure"
    public static final String KEY_CACHE_KPI_NODE_DIM = "nodeDimensionType"
    public static final String KEY_CACHE_GROUP_CROSSED_DIM = "userGroupCrossedDimensionType"
    public static final String KEY_CACHE_KPI_DIM_TYPE = "dimensiontype"
    public static final String KEY_CACHE_DIM_TYPE_BY_KPI = "kpi-dimensiontype"
    public static final String KEY_CACHE_DIM_TYPE_BY_KQI = "kqi-dimensiontype"
    public static final String KEY_CACHE_PROTOCOL = "protocol"
    public static final String KEY_CACHE_GROUP_TYPE = "groupType"
    public static final String KEY_CACHE_GROUP = "group"
    public static final String KEY_CACHE_SERVICE = "service"
    public static final String KEY_CACHE_DIMENSION = "dimensions"
    public static final String KEY_CACHE_NODE_DIMENSION = "nodeDimensions"
    public static final String KEY_CACHE_UNPROV_DIMENSION = "unprovDimensions"
    public static final String KEY_CACHE_PROT2PROT = "rcProt2ProcProt"
    public static final String KEY_CACHE_SECONDARYDIMTYPE = "secondaryDimensionType"
    public static final String KEY_CACHE_FAILURE_KPI = "failureKpi"
    public static final String KEY_CACHE_CONTROL_PLANE_PROTOCOL = "controlPlaneProtocol"
    public static final String KEY_CACHE_KPI_NODE_DIM_WILDCARD = "nodeDimensionTypeWithWildcard"
    public static final String KEY_CACHE_KPI_NODE_WILDCARD = "nodeDimensionWithWildcard"
    public static final String KEY_CACHE_KPI_NODE_VIM_DIM = "nodeVimDimensionTypeWithWildcard"
    public static final String KEY_CACHE_RC_PROTOCOL = "rcProtocol"
    public static final String KEY_CACHE_KPI_NODE_DIM_CTRL_PLANE = "ctrlPlaneNodeDimensionType"
    public static final String KEY_CACHE_MEASURE_KEY = "rcAttemptsMeasureKey"
    public static final String KEY_CACHE_RC_ATTEMPTS_RELATED_RCS = "rcAttemptsRelatedRCs"
    public static final String KEY_CACHE_RC_SUCCESS_FAILURE_FLAG = "rcSuccessFailureFlag"
    public static final String KEY_CACHE_RCC_IN_PROTOCOL = "rccInProtocol"
    public static final String KEY_CACHE_RC_IN_PROTOCOL = "rcInProtocol"
    public static final String KEY_CACHE_NODE_GROUP = "nodeGroup"
    public static final String KEY_CACHE_NODE_GROUP_TYPE = "nodeGroupType"
    public static final String KEY_CACHE_NODE_DIMENSION_TYPE = "nodeDimensionType"
    public static final String KEY_CACHE_NGT_WITH_NDIM_TYPE = "nodeGroupTypeWithNDimType"
    public static final String KEY_CACHE_NG_WITH_NDIM_NGP_TYPE = "nodeGroupWithNDimGrpType"
    public static final String KEY_CACHE_NODE_DIMENSION_IN_GROUP = "nodeDimensionsInGroup"
    public static final String KEY_CACHE_PROCEDURE_ATTRIBUTE = "attribute"
    public static final String KEY_CACHE_INTERFACE_PROCEDURE = "interfaceProcedure"
    public static final String KEY_CACHE_EXCLUDED_DIM_TYPE = "excludedDimType"
    public static final String KEY_CACHE_NODE = "node"

    public static final String KEY_CACHE_DRILL_DASHBOARD = "drillDashboardMap"

    public static final String DATA_TABLE_ATTR_GRP_ID = 'GRP_ID'
    public static final String DATA_TABLE_ATTR_GRPT_ID = 'GRPT_ID'
    public static final String DATA_TABLE_ATTR_ATTR_ID = 'ATTR_ID'

    public static final String DATE_TIME_DATA_FORMAT = "yyyy/MM/dd HH:mm:ss"

    public static final String CSV = "csv"
    public static final String FORMAT = "fmt"
    public static final String OFFSET = "offset"
    public static final int NEGATIVE_OP = -1


    //Aging Properties
    public static final long AGING_PROPERTIES_ID = -1

    //Dim_or_grp param
    public static final String PROCESS_DIM_OR_GRP = "processDimOrGrp"
    public static final String POLICY_COND_TYPE_LDV = "LDV"

    public static final String COGNOS_EXPORT = "COGNOS"

    //CGI ULI related
    public static final String DIMENSION_CGI = "CGI"
    public static final String DIMENSION_ULI = "ULI"
    public static final String UNKNOWN_CGIULI_DB = "00000000000-0"
    public static final String UNKNOWN_CGIULI_GUI = "Unknown"

    //the filter name of dynamic dimension types
    public static final String DYNAMIC_DIMTYPE = "dynamic-dimensionType-"
    public static final String DYNAMIC_GA_DIMTYPE = "dynamic-ga-dimensionType-"
    public static final String DYNAMIC_EA_DIMTYPE = "dynamic-ea-dimensionType-"
    public static final String DYNAMIC_DIM = "dynamic-dimension-"
    public static final int MAX_DIMTYPES = 5
    public static final String DYNAMIC_DIMTYPE_CACHE_NAME = "dynamicDimensionType"
    public static final String DYNAMIC_DIM_CACHE_NAME = "dynamicDimensions"
    public static final String DYNAMIC_DIMTYPE_GA_CACHE_NAME = "dynamicDimensionTypeWithGroup"
    public static final String DIMTYPE_NODE_SUFFIX = "_node"
    public static final String DIMTYPE_OTHER_SUFFIX = "_other"
    public static final String DIMTYPE_VIRT_SUFFIX = "_virt"
    public static final String DYNAMIC_DIM_WITH_GROUP_CACHE_NAME = "dynamicDimensionTypeWithGroup"
    public static final String DYNAMIC_DIMTYPE_1 = "dynamic-dimensionType-1"
    public static final String DYNAMIC_DIMTYPE_2 = "dynamic-dimensionType-2"
    public static final String DYNAMIC_GA_DIMTYPE_1 = "dynamic-ga-dimensionType-1"
    public static final String DYNAMIC_EA_DIMTYPE_1 = "dynamic-ea-dimensionType-1"
    public static final String DYNAMIC_EA_DIMTYPE_2 = "dynamic-ea-dimensionType-2"
    public static final String DYNAMIC_DIM_1 = "dynamic-dimension-1"

    public static final String DYNAMIC_NODE_GROUP_TYPE_PARAM = "nodeGroupTypeWithDimType"
    public static final String DYNAMIC_NODE_GROUP_PARAM = "nodeGroupWithType"
    public static final String DYNAMIC_EA_NODE_GROUP_TYPE_PARAM = "ea-nodeGroupTypeWithDimType"
    public static final String DYNAMIC_EA_NODE_GROUP_PARAM = "ea-nodeGroupWithType"

    public static final String DYNAMIC_GA_NODE_GROUP_TYPE_PARAM = "ga-nodeGroupTypeWithDimType"
    public static final String DYNAMIC_GA_NODE_GROUP_PARAM = "ga-nodeGroupWithType"

    public static final String MAX_DIMTYPE_WITH_GROUP = "MaxDimTypeWithGrp"
    public static final String MAX_DIMTYPE_NO_GROUP = "MaxDimTypeNoGrp"

    public static final String SDRA_NODE = "115_node"
    public static final String DDRA_NODE = "116_node"
    public static final String SOURCE_NODE = "26_node"
    public static final String DESTINATION_NODE = "27_node"

    public static final String DRILLCONST = "Drill"

    public static final String DASHBOARD_PEA_KEY = "Proactive_Element_Analysis"
    public static final String DASHBOARD_FASTPATH_KEY = "FastPath"

    public static final String MOS_RANGE = "MOS Range"
    public static final String MOS_DISPLAY_NAME =  "MOS"
    public static final String QCI_MUNIT = "Mbps"
    public static final String QCI_KUNIT = "Kbps"

    public static final String FULL_NETWORK_SERVICE_NAME = "Full Network"

    public static final String ANONYMOUS_USER = "anonymousUser"

    // status of filter previllige check
    public static final String N_EXIST = "not exist"
    public static final String N_PREV = "not has previllige"

    // ipi plist
    public static final String IPI_PLIST = "com.tektronix.iris.server.ipi"
    public static final String FAILED_CDRLOG_MAX_TIME_WINDOW = "failedCdrLogMaxTimeWindow"
    public static final String DRILL_CDRLOG_MAX_TIME_WINDOW = "drillCdrLogMaxTimeWindow"
    public static final String ENTRY_MAX_TIME_WINDOW = "entryMaxTimeWindow"
    public static final String HOURLY_MAX_TIME_WINDOW = "hourlyMaxTimeWindow"
    public static final Integer ENTRY_MAX_TIME_WINDOW_VALUE = 312
    public static final Integer HOURLY_MAX_TIME_WINDOW_VALUE = 192
    public static final Integer AF_ENTRY_MAX_TIME_WINDOW_VALUE = 48
    public static final Integer AF_HOURLY_MAX_TIME_WINDOW_VALUE = 24

    public static final String AUDIT_FROMTIME_OFFSET = "auditFromTimeOffset"
    public static final String AUDIT_TOTIME_OFFSET = "auditToTimeOffset"
}
