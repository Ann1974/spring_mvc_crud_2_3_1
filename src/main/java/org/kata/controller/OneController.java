package org.kata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OneController {

    @GetMapping("/")
    public String springTest(){
        return "index";
    }

}
