package com.example;

public interface CalculatorModelInterface {

    double add(double x, double y);
    double subtract(double x, double y);
    double multiply(double x, double y);
    double divide(double x, double y);
    double opposite(double x);
    void push(double value);
    double pop();
    void drop();
    void swap();
    void clear();
    
}
