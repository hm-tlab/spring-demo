package com.example.demo.web.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String generateMessage() {
        return "hello world";
    }
}
