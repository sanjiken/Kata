package com.craft.kata.controller;


import java.util.logging.Logger;

import com.craft.kata.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculator")
public class kataController {
    Logger logger = Logger.getLogger("");


    @Autowired
    private CalculatorService calculatorService;

    /**
     *
     * @param numbers
     * @return the sum of string number separate by comma
     */
    @PostMapping("/run")
    public ResponseEntity<Integer> kataCalculator(@RequestParam(value = "numbers") String numbers) {

        logger.info("parameter received : " + numbers);
        return new ResponseEntity<>(calculatorService.add(numbers), HttpStatus.OK);
    }

}
