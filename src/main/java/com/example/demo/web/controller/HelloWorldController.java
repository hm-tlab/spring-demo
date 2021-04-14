package com.example.demo.web.controller;

import com.example.demo.web.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    @GetMapping("/")
    public String index(Model model) {
        String message = helloWorldService.generateMessage();
        model.addAttribute("msg", message);
        return "index";
    }
}
