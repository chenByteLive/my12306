package com.byteLive.convention.exception;

import com.byteLive.convention.errorcode.BaseErrorCode;
import com.byteLive.convention.errorcode.IErrorCode;
import lombok.ToString;

/**
 * 第三方异常
 */
@ToString
public class RemoteException extends AbstractException {
    public RemoteException(IErrorCode errorCode) {
        super(null,null,errorCode);
    }
    public RemoteException(String message) {
        super(message,null, BaseErrorCode.REMOTE_ERROR);
    }
    public RemoteException(String message, IErrorCode errorCode) {
        super(message,null,errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }
}
