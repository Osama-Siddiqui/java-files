package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Integer Maximum + 1 = " + (myMaxIntValue + 1));
        System.out.println("Integer Minimum - 1 = " + (myMinIntValue - 1));
//        int myTest = 2147483647;
//        System.out.println(myTest);
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("myMaxByteValue = " + myMaxByteValue);
        System.out.println("myMinByteValue = " + myMinByteValue);


        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("myMaxShortValue = "+ myMaxShortValue);
        System.out.println("myMinShortValue = "+ myMinShortValue);//*/


        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("myMaxLongValue = "+ myMaxLongValue);
        System.out.println("myMinLongValue = "+ myMinLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMaxByteValue/ 2);
        short myNewShortValue = (short)(myMinShortValue /2);


        byte cByte = 10;
        short cShort = 500;
        int cInt = 1000;
        long cLong = 50000 + 10 * (cByte + cShort + cInt);
        System.out.println("long is: " + cLong);

    }
}
