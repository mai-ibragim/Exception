package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("may.txt");
        } catch (IOException e) {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println(6 / 2);
        } catch (Throwable e) {
            System.out.println("Throwable");
        }
        System.out.println("Hello world");
    }
}
