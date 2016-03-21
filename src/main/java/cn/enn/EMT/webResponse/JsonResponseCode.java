package cn.enn.EMT.webResponse;

public class JsonResponseCode {
	
	public static final String SUCCESS = "success";
    public static final String INVALID_REQUEST = "invalid.request";
    public static final String SYSTEM_EXCEPTION = "system.exception";
    public static final String INVALID_PARAMETER = "invalid.parameter";

    //websocket
    public static final String INVALID_MESSAGE = "invalid.message";
    public static final String INVALID_COMMAND = "invalid.command";
    //websocket

    public static final String INVALID_TOKEN = "invalid.token";
    public static final String TOKEN_REQUIRED = "token.required";
    public static final String DISABLED = "disabled";
    public static final String LOGIN_ERROR = "login.error";
    public static final String NOT_LOGIN_ERROR = "login.error.notlogin";

    public static final String INVALID_OLD_PASSWORD = "invalid.old.password";


    public static final String CAN_NOT_FOUND_IMG = "can.not.found.img";
    public static final String LOAD_IMG_FAILURE = "load.img.failure";
    public static final String INVALID_IMG = "invalid.img";


    public static final String INVALID_VERSION = "invalid.version";


    public static final String PHONE_IS_ALREADY_EXISTS = "phone.is.already.exists";
    public static final String PHONE_NOT_EXISTS = "phone.not.exists";
    public static final String INVALID_PHONE = "invalid.phone";
    public static final String CAPTCHA_SEND_OUT_OF_TIMES = "captcha.send.out.of.times";
    public static final String CAPTCHA_SEND_FAST = "captcha.send.fast";
    public static final String CAPTCHA_SEND_FAILURE = "captcha.send.failure";
    public static final String INVALID_CAPTCHA = "invalid.captcha";
    public static final String CAPTCHA_IS_ALREADY_USED = "captcha.is.already.used";
    public static final String CAPTCHA_IS_ALREADY_INVALID = "captcha.is.already.invalid";
    public static final String CAPTCHA_EXPIRED = "captcha.expired";

    public static final String CAN_NOT_FOUND_USER = "can.not.found.user";
    public static final String INVALID_LOCATION = "invalid.location";
    public static final String CAN_NOT_FOUND_DELIVERY_ADDRESS = "can.not.found.delivery.address";
    public static final String INVALID_PERMISSIONS = "invalid.permissions";
    public static final String CAN_NOT_FOUND_MESSAGE_BOARD = "can.not.found.message.board";
    public static final String LIKED = "liked";

    public static final String CAN_NOT_FOUND_COMMUNITY = "can.not.found.message.community";
    public static final String AUTH_COMMUNITY_FIRST = "auth.community.first";
    public static final String SELECT_COMMUNITY_FIRST = "select.community.first";
    public static final String FOCUSED = "focused";
    public static final String UN_FOCUSED = "un.focused";
    public static final String ALREADY_FAMILY = "already.family";
    public static final String NOT_FAMILY = "not.family";
    public static final String NOT_SUPPORTED = "not.supported";
}
