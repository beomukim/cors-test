package com.corstest.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String test() {
        return "테스트입니다.";
    }

    @PostMapping
    public String test1() {
        return "테스트입니다.";
    }

    @PutMapping
    public String test2() {
        return "테스트입니다.";
    }

    @PatchMapping
    public String test3() {
        return "테스트입니다.";
    }

    @DeleteMapping
    public String test4() {
        return "테스트입니다.";
    }

}
