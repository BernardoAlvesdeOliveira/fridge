package com.projetoBernardo.Fridge.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageController {

    @GetMapping
    public ResponseEntity<String> page() {
        return ResponseEntity.ok("Hello World! Spring Bernardo!");
    }

}
