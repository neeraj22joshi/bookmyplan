package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class travel2 {

    @GetMapping("/travel2")
    public String getData() {
        return "Hello welcome to Bookmyplan!, Please book rail here";
    }
}