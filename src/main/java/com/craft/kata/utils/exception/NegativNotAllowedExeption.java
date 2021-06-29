package com.craft.kata.utils.exception;

/**
 * ToDO : to customise {@link IllegalArgumentException}
 */
public class NegativNotAllowedExeption extends IllegalArgumentException {

    String msg;

    NegativNotAllowedExeption(String msg) {
        super(msg);
        this.msg = msg;
    }
}
