package com.craft.kata.service.impl;

import com.craft.kata.service.CalculatorService;
import com.craft.kata.utils.converter.ConverterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private ConverterUtils converterUtils;


    public int add(String input) {
        String[] numbers = input.split(",|\n");

        if (input.isEmpty()) {
            return 0;
        } else if (numbers.length > 1) {
            return getSum(numbers);
        }
        return converterUtils.stringToInt(input);
    }

    private int getSum(String[] numbers) {
        int sum = 0;
        for (String currentNumber:numbers) {
            if (converterUtils.stringToInt(currentNumber) > 1000) {
                continue;
            }
            sum += converterUtils.stringToInt(currentNumber);
        }
        return sum;
    }
}
