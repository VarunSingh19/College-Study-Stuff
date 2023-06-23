//  Function is a code of block which can be reuse as much we want
//  Syntax:
//  returnType functionName(type args1, type args2){
//  operations
//  }

// import java.util.Scanner;

// public class Functions {
//     public static void main(String[] args) {

//         System.out.println("<-----------Functions---------->");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Name:");
//         String name = sc.next();

//         printName(name);
//     }

//     public static void printName(String name) {
//         System.out.println("Name Is: "+name);
//         return;
//     }
// }

//My Try 
// import java.util.Scanner;

// public class Functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Name Please :");
//         String name = sc.next();
//         Myname(name);
//     }

//     // Function
//     public static void Myname(String name) {
//         System.out.println("Welcome " + "'" + name + "'" + " Sir!!!");
//         return;

//     }

// }

// import java.util.Scanner;

// public class Functions {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st Num : ");
//         int a = sc.nextInt();
//         System.out.print("Enter 2st Num : ");
//         int b = sc.nextInt();

//         Multiply(a, b);
//     }

//     public static int Multiply(int a, int b) {
//         int z;
//         z = a * b;
//         System.out.print("Your Multiply is : "+z);
//         return z;
//     }
// }

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();
        Factorial(num);

    }

    // public static int Factorial(int num) {
    // using Recursion.
    // if (num == 1) {
    // return 1;
    // }
    // int product = num * Factorial(num - 1);
    // return product;

    
    public static void Factorial(int num) {
        // Using Iteration.
        int Fact = 1;
        for (int i = num; i >= 1; i--) {
            Fact = Fact * i;
        }
        System.out.println(Fact);
        return;
    }
}
