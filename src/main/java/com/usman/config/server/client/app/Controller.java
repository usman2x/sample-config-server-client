package com.usman.config.server.client.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController()
@RequestMapping("/api")
public class Controller {

    @Value("${msg}")
    private String message;

    @GetMapping("/message")
    private ResponseEntity<String> getMessage() {
        return new ResponseEntity<>("Message " + this.message,
                HttpStatus.OK);
    }
}
