package com.lyy.snake.core.exceptions;

/**
 * Created by fanshuai on 15/6/3.
 */
public class CannotConnectionException extends Exception {
    public CannotConnectionException(String errorMsg){
        super(errorMsg);
    }
}