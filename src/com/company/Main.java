package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        try {
            int a = in.nextInt();
            myMethod(a);
        } catch (InputMismatchException e) {
            System.out.println("Input was incorrect");
        }
    }
    public static void myMethod(int a){
        int b = 3;
        int c = a % b;
        if (c == 0){
            System.out.println(true); }
        else {
            System.out.println(false); }
    }


}