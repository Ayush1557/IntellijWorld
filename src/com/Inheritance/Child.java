package com.Inheritance;

public class Child extends Main{
    public static void main(String[] args) {

    }

    String naam;

    public Child () {
        this.naam = "child";
    }

    public Child(int number, String name, String naam) {
        super(number, name);  //super keyword invoke parent class constructor
        this.naam = naam;
    }
}
