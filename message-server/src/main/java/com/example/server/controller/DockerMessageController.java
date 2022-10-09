package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {

    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Message Server!";
    }

}
