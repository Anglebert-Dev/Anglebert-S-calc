package com.example.simple.calculator.server;

//DO MATH
public interface Calculator  {
    public static Equation add(Double left, Double right) {
        return new Equation(left, right, left + right, "+");
    }

    public static Equation subtract(Double left, Double right) {
        return new Equation(left, right, left - right, "-");
    }

    public static Equation multiply(Double left, Double right) {
        return new Equation(left, right, left * right, "*");
    }

    public static Equation divide(Double left, Double right) {
        return new Equation(left, right, left / right, "/");
    }

//    public static Equation Power(Double left, Double right) {
//        return new Equation(left, right, Math.pow(left,right), "**");
//    }
//    public static Equation Log10(Double left) {
//        return new Equation(left, null, Math.log10(left), "log");
//    }
//    public static Equation Ln(Double left) {
//        return new Equation(left, null, Math.log(left), "ln");
//    }
}