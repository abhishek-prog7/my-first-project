package com.learn.maven;

import com.test.depend.messageSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        messageSource message = new messageSource();
        System.out.println(message.getMessage());
    }
}