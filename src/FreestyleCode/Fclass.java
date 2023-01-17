package FreestyleCode;

public class Fclass {
    public static void main(String[] args) {

        Student o1 = new Student(213, "Ayush");
//        o1.name = "Ayush";
//        o1.number = 123;
//
        System.out.println(o1.name  + " " + o1.number);

    }
}

class Student {         //class DataType

    int number;
    String name;   //instance variables inside the class but outside the method

    //using constructor
    //constructor are the special functions


    public Student(int number, String name) {
        this.number = number;  // this is similar to o1.number ==> this.number
        this.name = name;
    }
}
