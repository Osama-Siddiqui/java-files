package com.company;

import java.util.Scanner;
import java.util.Arrays;
public static void main(String[] args){

public class Main {
    //    public static void main(String[] args);
    private int[] A;
    private int size;

    //default constructor
    public Main() {
        A = new int[100];
        size = 0;
    }

    //constructor that accepts and integer s (size of the array)
    public Main(int s) {
        A = new int[s];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return A.length;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public String toString() {
        if (this.isEmpty())
            return "[]";
        String st = "[";
        for (int i = 0; i < size - 1; i++) {
            st += A[i] + ", ";
        }
        //deal with the last element separately
        st += A[size - 1] + "]";
        return st;
    }

    public void add(int e) {
        //add e at the back of the array. The back is index size the empty spot
        A[size] = e;
        //increase the size
        size++;
    }

    //Homework
    public void remove() {
        //remove the first integer and return it
        int removeIndex = 1;

        for (int i = removeIndex; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        }
        //save the first integer

        //bring down all other elements

        //decrease size

        //return the saved integer.
    }
}

        }
