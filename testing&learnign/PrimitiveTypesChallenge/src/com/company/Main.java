package com.company;

public class Main {

    public static void main(String[] args) {
        byte cByte = 10;
        short cShort = 20;
        int cInt = 50;
        long cLong = 50000L + 10L * (cByte + cShort + cInt);
        System.out.println("long is: " + cLong);

        short shortTotal =(short) (1000 + 10 *(cByte + cShort + cInt));

    }
}
