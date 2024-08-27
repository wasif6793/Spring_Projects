package org.springboot.numaddwithspring.numController;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@RequestMapping("num")
public class NumController {
    @GetMapping(value = "result")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;


        return "result is " + sum;
    }

}
