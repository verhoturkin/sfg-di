package com.example.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 16:21
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello world!");
        return "HI!";
    }
}
