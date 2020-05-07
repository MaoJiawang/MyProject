package com.xp.exception;

public class BusinessException extends Exception {
  private static final long serialVersionUID = 4030637727962750515L;
  private final String errorCode;
  private final String errorMsg;

  /**
   * 异常构造方法
   * 
   * @param errorCode 异常代码
   * @param errorMsg  异常信息
   */
  public BusinessException(String errorCode, String errorMsg) {
    super(errorMsg);
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  // 错误代码(String类型，掌医用)
  public static final String CODE_NO_DATA = "-1";
  public static final String CODE_SUCCESS = "0";
  public static final String CODE_FAIL = "1";
  public static final String CODE_ERROR = "9";
  public static final String INFO_SUCCESS = "请求成功";
  public static final String INFO_SERVER_ERROR = "服务器异常";
  public static final String INFO_RETURN_IS_EMPTY = "返回数据为空";
  public static final String INFO_REQUEST_TIMEOUT = "请求超时";
  public static final String INFO_PARAM_IS_MISSING = "请求参数缺失";
}
