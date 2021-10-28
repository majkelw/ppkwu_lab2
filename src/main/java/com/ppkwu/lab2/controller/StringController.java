package com.ppkwu.lab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/api/string")
    public String printString(@RequestParam(name = "str") String str){
        return str;
    }
}
