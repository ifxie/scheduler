package com.analysisplatform.core;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
    /**含义：成功*/
    SUCCESS(200),
    /**含义：失败*/
    FAIL(400),
    /**含义：未认证，签名错误*/
    UNAUTHORIZED(401),
    /**含义：接口不存在*/
    NOT_FOUND(404),
    /**含义：服务器内部错误*/
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
