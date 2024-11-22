package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/all")
    public List<String> listfun() {
        List<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("Arush");
        list.add("Nakul");
        list.add("Yash");

        return list;
    }
}
