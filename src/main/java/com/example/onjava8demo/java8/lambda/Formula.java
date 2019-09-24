package com.example.onjava8demo.java8.lambda;

interface Formula {

    static void main(String[] args) {
        Formula formula = a -> a * 100;

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));

    }

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}