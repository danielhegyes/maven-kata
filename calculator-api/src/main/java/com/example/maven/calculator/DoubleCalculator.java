package com.example.maven.calculator;

public interface DoubleCalculator {

    static void testIfItsJava8Project() {}

    double sum(double summand1, double summand2);
    double difference(double minuend, double subtrahend);
    double product(double multiplicand1, double multiplicand2);

}
