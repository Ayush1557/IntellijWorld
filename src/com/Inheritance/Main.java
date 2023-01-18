package com.Inheritance;

public class Main {
    public static void main(String [] args) {


    }
    int number;
    String name;
    String sname = "operator";

    public Main(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Main (Main clone) {
        this.name = clone.name;
        this.number = clone.number;
    }

    public Main (int num) {
        this.name = "IDE";
        this.number = num;
    }

    public Main () {
        this.name = "Ayush";
        this.number = 90;
    }
}