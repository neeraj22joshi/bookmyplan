package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {

    @GetMapping("/flight")
    public String getData() {
        return "Hello welcome to Bookm yplan!, Please book flight here";
    }
}