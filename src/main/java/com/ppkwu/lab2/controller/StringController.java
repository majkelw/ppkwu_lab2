package com.ppkwu.lab2.controller;

import com.ppkwu.lab2.StringStatistic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/api/string")
    public StringStatistic printString(@RequestParam(name = "str") String str){
        StringStatistic stringAnalyzer = new StringStatistic();
        return stringAnalyzer.analyze(str);
    }
}
