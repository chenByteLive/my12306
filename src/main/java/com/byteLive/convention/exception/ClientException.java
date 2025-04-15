package com.byteLive.convention.exception;

import com.byteLive.convention.errorcode.BaseErrorCode;
import com.byteLive.convention.errorcode.IErrorCode;
import lombok.ToString;

/**
 * 客户端异常
 */
@ToString
public class ClientException extends AbstractException{

    public ClientException(IErrorCode errorCode) {
        super(null,null,errorCode);
    }
    public ClientException(String message) {
        super(message,null, BaseErrorCode.CLIENT_ERROR);
    }
    public ClientException(String message, IErrorCode errorCode) {
        super(message,null,errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }
}
