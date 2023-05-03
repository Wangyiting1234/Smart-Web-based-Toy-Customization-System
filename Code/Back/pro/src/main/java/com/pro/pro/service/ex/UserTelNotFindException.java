package com.pro.pro.service.ex;

public class UserTelNotFindException extends ServiceException{
    public UserTelNotFindException() {
        super();
    }

    public UserTelNotFindException(String message) {
        super(message);
    }

    public UserTelNotFindException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserTelNotFindException(Throwable cause) {
        super(cause);
    }

    public UserTelNotFindException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
