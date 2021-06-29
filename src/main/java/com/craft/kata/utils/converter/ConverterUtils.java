package com.craft.kata.utils.converter;

import org.springframework.stereotype.Service;

@Service
public class ConverterUtils {

    public int stringToInt(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative input!");
        } else {
            return num;
        }
    }

}
