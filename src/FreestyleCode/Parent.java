package FreestyleCode;


public class Parent extends child {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
        child obj1 = new Parent(456,123, "shashank");
        System.out.println(obj1.name + " " + obj1.number);
        Parent.display();

//        Parent obj2 = new Parent();
//        System.out.println();
    }
    int num;
    public Parent (int num, int number, String name) {
        super(number, name);
        this.num = num;
    }
//    public String toString () {
//        return num + " " +number + " " + name;
//    }

//    String name = sc.nextInt();
}

class child {
    int number;
    String name;



    public child (int number, String name) {
        this.number = number;
        this.name = name;
        this.show();
    }

    public void show () {
        System.out.println("Child class method");
    }

    public child () {
        this.number = -1;
        this.name  = "null";
    }

    public static void display () {
        System.out.println("child class Static method");
    }

    static  {
        System.out.println("+++++++Static Block");
    }
}