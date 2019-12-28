package com.itvdn.javaEssential.ex003_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Exception handling");
            System.out.println(e.getMessage());
        }
    }
}
