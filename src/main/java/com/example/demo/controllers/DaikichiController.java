package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
    @RequestMapping("/")
    public String index(@RequestParam(value="q") String searchQuery) {
        return "You searched for: " + searchQuery;
    }
}