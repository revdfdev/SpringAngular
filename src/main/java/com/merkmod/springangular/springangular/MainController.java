package com.merkmod.springangular.springangular;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/application")
@RequestMapping("/application/v1")
public class MainController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello() {
        return "hello world";
    }

}
