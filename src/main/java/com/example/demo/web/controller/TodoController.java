package com.example.demo.web.controller;

import com.example.demo.web.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping("/")
    public String index(Model model) {
        String message = todoService.generateMessage();
        model.addAttribute("msg", message);
        return "index";
    }
}
