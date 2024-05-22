package com.example.project10;

import org.springframework.stereotype.Component;

public class StreetFighter implements Fighter{
    @Override
    public void doFight() {
        System.out.println("StreetFigher is fighting");
    }
}

