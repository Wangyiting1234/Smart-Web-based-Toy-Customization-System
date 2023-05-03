package com.pro.pro.service.ex;

/** telephone number already register*/

public class UserTelDuplicateException extends ServiceException{
    public UserTelDuplicateException() {
        super();
    }

    public UserTelDuplicateException(String message) {
        super(message);
    }

    public UserTelDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserTelDuplicateException(Throwable cause) {
        super(cause);
    }

    protected UserTelDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
