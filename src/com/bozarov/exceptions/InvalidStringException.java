package com.bozarov.exceptions;

public class InvalidStringException extends Exception{

    public InvalidStringException() {
        super("Input is not a string");
    }

    public InvalidStringException (String message) {
        super(message);
    }

}
