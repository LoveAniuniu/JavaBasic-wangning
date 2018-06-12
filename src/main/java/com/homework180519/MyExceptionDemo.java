package com.homework180519;

/**
 * Created by WangNing.
 * Date: 2018/5/22
 * Time: 20:01
 * 自己的异常
 */

public class MyExceptionDemo extends RuntimeException{
    public MyExceptionDemo() {
    }

    public MyExceptionDemo(String message) {
        super(message);
    }

    public MyExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptionDemo(Throwable cause) {
        super(cause);
    }

    public MyExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
