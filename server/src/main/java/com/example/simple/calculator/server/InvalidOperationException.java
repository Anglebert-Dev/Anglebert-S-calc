package com.example.simple.calculator.server;

public class InvalidOperationException extends Exception{
    public InvalidOperationException(String message){
        super(message);
    }
}
