package com.byteLive.convention.exception;

import com.byteLive.convention.errorcode.BaseErrorCode;
import com.byteLive.convention.errorcode.IErrorCode;
import lombok.ToString;

/**
 * 服务端异常
 */
@ToString
public class ServiceException extends AbstractException {
    public ServiceException(String message) {
        super(message,null, BaseErrorCode.SERVICE_ERROR);
    }
    public ServiceException(String message, IErrorCode errorCode) {
        super(message,null, errorCode);
    }
    public ServiceException(IErrorCode errorCode) {
        super(null,null,errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message,throwable,errorCode);
    }
}
