package org.springboot.numaddwithspring.numService;


import org.springframework.stereotype.Service;

@Service
public class NumService {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

