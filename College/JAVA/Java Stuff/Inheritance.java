//  The idea behind inheritance in Java is that you can 
//  create new classes that are built upon existing classes.
//  When you inherit from an existing class, you can reuse
//  methods and fields of the parent class. Moreover, you 
//  can add new methods and fields in your current class 
//  also.

// Example.
// class Shape { //Parent Class.
//     String color;
// }
// class Triangle extends Shape { //child Class or Sub Class.

// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//     }
// }


// Single Level Inheritance.
class Shape { 
    // String color;
    public void area() {
        System.out.println("Display Area.");
    }
    
}

class Triangle extends Shape { //Single leve ends here
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {//Multilevel
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}


// Heirarchy Level
// here we extends Shape in circle and in triangle.
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        
    }
}