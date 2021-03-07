package com.programs;

public class CODE_PercentageCalculator {
    public static void main(String[] args) {
        byte english = 70;
        byte hindi = 90;
        byte maths = 86;
        byte science = 98;
        byte social_sci = 92;
        float total = english + hindi + maths + science + social_sci;
        float percentage = (total / 500) * 100;
        System.out.print("The percentage are "+percentage);

    }
}
