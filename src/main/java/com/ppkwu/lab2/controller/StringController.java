package com.ppkwu.lab2.controller;

import com.ppkwu.lab2.analyzer.StringAnalyzer;
import com.ppkwu.lab2.analyzer.StringStats;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/api/string")
    public StringStats printStringStats(@RequestParam(name = "str") String str){
        StringAnalyzer stringAnalyzer = new StringAnalyzer();
        return stringAnalyzer.analyze(str);
    }
}
