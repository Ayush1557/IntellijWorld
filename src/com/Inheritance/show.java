package com.Inheritance;

public class show {
    public static void main(String[] args) {

        Child ob1 = new Child();
        System.out.println(ob1.name + " " + ob1.number + " " + ob1.naam);

        Child ob2 = new Child(13, "shashank", "aayush");

        System.out.println(ob2.name + " " + ob2.number + " " +  ob2.naam);

        Main ob3 = new Child(123, "ayush", "shashank");
        System.out.println(ob3.name + " " + ob3.number);

        Child ob4 = new Main(23, "Ayush");
    }
}
