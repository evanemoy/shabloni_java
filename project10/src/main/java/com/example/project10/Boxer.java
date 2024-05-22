package com.example.project10;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Boxer implements Fighter{
    @Override
    public void doFight() {
        System.out.println("Boxer is fighting");
    }
}
