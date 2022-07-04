package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sayHi(getName());

    }
    static String getName(){
        System.out.println("Enter your name");
        Scanner scanner =new Scanner(System.in);
        return scanner.nextLine();
    }
    static void sayHi(String name){
        System.out.printf("Hi %s",name);
    }
}
