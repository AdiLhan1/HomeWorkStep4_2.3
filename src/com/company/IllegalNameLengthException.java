package com.company;

import java.util.Scanner;

public class IllegalNameLengthException extends Exception {
    public IllegalNameLengthException(String message) {
        super(message);
    }
}
