package com.albi;

public class Main {

    public static void main(String[] args) {
        String bear = "\ud83d\udc3b";

        int bearCodePoint = bear.codePointAt(bear.offsetByCodePoints(0, 0));
        int surpriseCodePoint = bearCodePoint + 1;

        char surpriseAnimal[] = {Character.highSurrogate(surpriseCodePoint), Character.lowSurrogate(surpriseCodePoint)};

        System.out.println(String.format("I am: %s. You are: %s", bear, String.valueOf(surpriseAnimal)));
    }
}
