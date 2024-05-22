package com.example.project10;

import org.springframework.stereotype.Component;

public class Judoka implements Fighter{
    @Override
    public void doFight() {
        System.out.println("Judoka is fighting");
    }
}
