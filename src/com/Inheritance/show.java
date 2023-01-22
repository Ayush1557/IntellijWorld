package com.Inheritance;

public class show {
    public static void main(String[] args) {

        Child ob1 = new Child();
        System.out.println(ob1.name + " " + ob1.number + " " + ob1.naam);

        Child ob2 = new Child(13, "shashank", "aayush");
        System.out.println(ob2.name + " " + ob2.number + " " +  ob2.naam);

        Child obj3 = new Child(ob2);
        System.out.println(obj3.sname +  " " + obj3.name  + " " + obj3.naam + " " + obj3.number);

        Main ob3 = new Child(123, "ayush", "shashank");
        System.out.println(ob3.name + " " + ob3.number);

        //NOTE THAT
//        there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. child class
        // hence, you should have access to naam variable
        // this also means, that the ones you are trying to access should be initilized
        //but here, when the object itself if of type parent class, how will you call the child class variables
        //this is why error
//        Child ob4 = new Main(23, "Ayush");
    }
}
