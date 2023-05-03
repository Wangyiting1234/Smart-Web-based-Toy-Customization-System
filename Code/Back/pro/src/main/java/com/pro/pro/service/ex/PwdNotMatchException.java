package com.pro.pro.service.ex;

/**user password is not match with user telephone*/
public class PwdNotMatchException extends ServiceException{

    public PwdNotMatchException() {
        super();
    }
    public PwdNotMatchException(String message) {
        super(message);
    }

    public PwdNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PwdNotMatchException(Throwable cause) {
        super(cause);
    }

    public PwdNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
