package com.max015012;

import java.util.Arrays;

public class Main {
    private static final Runnable[] RUNNABLE_APPS = {
    };

    public static void main(String[] args) {
        Arrays.stream(RUNNABLE_APPS).forEach(Runnable::run);
    }
}