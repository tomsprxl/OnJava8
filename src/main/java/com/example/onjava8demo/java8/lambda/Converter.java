package com.example.onjava8demo.java8.lambda;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}