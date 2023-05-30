package com.example.jsoup2.controller;


import com.example.jsoup2.service.JsoupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Jsoupcontroller {
    private final JsoupService jsoupService;

    @GetMapping("/")
    public void Jsoupinsert() throws Exception {
        jsoupService.jsoupservice();
    }


}
