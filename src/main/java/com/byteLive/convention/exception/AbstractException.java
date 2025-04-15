package com.byteLive.convention.exception;

import com.byteLive.convention.errorcode.IErrorCode;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.Optional;

/**
 * 抽象异常
 */

@Getter
public abstract class AbstractException extends RuntimeException {
    public final String errorCode;
    public final String errorMessage;

    public AbstractException(String message, Throwable throwable , IErrorCode errorCode) {
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(message).orElse(errorCode.message());
    }
}
