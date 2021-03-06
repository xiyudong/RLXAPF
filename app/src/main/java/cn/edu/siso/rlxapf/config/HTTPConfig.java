package cn.edu.siso.rlxapf.config;

public class HTTPConfig {

    /**
     * 登录异常信息
     */
    public class HttpLoginError {
        /**
         * 账户或密码没有设置
         */
        public static final int ACCOUNT_NO_SET = 1;
        /**
         * 账户或密码为空
         */
        public static final int ACCOUNT_EMPTY = 2;
        /**
         * 验证失败
         */
        public static final int ACCOUNT_CHECK_FAIL = 3;
    }

    /**
     * 获取设备列表异常信息
     */
    public class DeviceListError {
        /**
         * mobileid没有设置
         */
        public static final int MOBILE_ID_NO_SET = 1;
        /**
         * session没有设置
         */
        public static final int SESSION_NO_SET = 2;
        /**
         * session错误
         */
        public static final int SESSION_ERROR = 3;
        /**
         * 没有数据
         */
        public static final int NO_DATA = 4;
    }

    public static final int HTTP_TIME_TIME = 10000;

    /**
     * 登录地址
     */
    public static final String API_URL_LOGIN = "Jasonlogin.aspx";

    /**
     * 查找设备
     */
    public static final String API_URL_QUERY_DEVICE = "JasonQueryDevice.aspx";

    /**
     * 查找省级信息
     */
    public static final String API_URL_QUERY_PROVINCE = "JasonQueryProvince.aspx";

    /**
     * 查找市级信息
     */
    public static final String API_URL_QUERY_CITY = "JasonQueryCity.aspx";

    /**
     * 查找区级信息
     */
    public static final String API_URL_QUERY_COUNTY = "JasonQueryCounty.aspx";

    /**
     * 查找公司信息
     */
    public static final String API_URL_QUERY_CUSTOMER = "JasonQueryCustomer.aspx";

    /**
     * 查找设备类型
     */
    public static final String API_URL_QUERY_DEVICE_TYPE = "JasonQueryDeviceType.aspx";

    /**
     * 查找GPRS编号
     */
    public static final String API_URL_QUERY_GPRS = "JasonQueryDeviceList.aspx";

    /**
     * 开关设备
     */
    public static final String API_URL_ON_OFF_DEVICE = "JasonSetDevice.aspx";

}
