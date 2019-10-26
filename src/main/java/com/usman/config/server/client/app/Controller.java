package com.usman.config.server.client.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController()
@RequestMapping("/api")
public class Controller {

    @Value("${myHelloWorldMessage:This is default message}")
    private String message;

    @GetMapping("/message")
    private String getMessage() {
        return this.message;
    }
}
