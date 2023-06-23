
// 9.Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
// 10.Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 .....
// 11.In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)



import java.util.Scanner;
import java.lang.Math;
import javax.lang.model.util.ElementScanner14;
import javax.xml.transform.SourceLocator;

public class HomeWorkExercise {
    public static void main(String[] args) {
        // AverageOfThreeNum(3,4,5);
        // SumOfAllOddNum(5);
        // GreaterOfTwoNum(232, 322);
        // Circumference(12);
        // VoteEligibleCheck(18);
        // InfiniteDoWhileLoop();  //Dont Run Nigga.
        // CountNegPosZeros(); //Errors
    
        PowerFunx(); 

    }
    
    // 8.Two numbers are entered by the user, x and n. Write a function to find the value of one 
    // number raised to the power of another i.e. .

    public static void PowerFunx() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Num x");
        double x = sc.nextInt();
        System.out.println("Enter Second Num n");
        double n = sc.nextInt();

        double result = Math.pow(x, n);
        System.out.println(result);
    }






    // 7.Write a program to enter the numbers till the user wants and at the end it should 
    // display the count of positive, negative and zeros entered.
    
    public static void CountNegPosZeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Number You Want to Input?");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int myNums = sc.nextInt();
            int count = 0;
            if (myNums > 0) {
                // count = count +i;
                System.out.println("Positive Numbers are : "+ count);
            }else if(myNums<0){
                // count = count +i;
                System.out.println("Negative Numbers are : "+ count);
            } else if (myNums == 0) {
                System.out.println("Zeros are : "+ count);
            } else {
                System.out.println("Invalid Input.");
            }
            count = count +i;
        }
        
        
    }



    // 6.Write an infinite loop using do while condition.
    public static void InfiniteDoWhileLoop() {
        do{
            System.out.println("This is True");
        } while (true);
    }
    
    
    
    
    // 5.Write a function that takes in age as input and returns 
    // if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void VoteEligibleCheck(int age) {
        if (age >= 18 && age<=100) {
            System.out.println("Your Age is : " + age);
            System.out.println("You Are Eligible For Vote.");
        } else {
            System.out.println("Your Age is : " + age);
            System.out.println("Sorry You are Not Eligible For Vote");
        }
    }


    
    
    // 4. Take Radius And Return Circumference.
    public static void Circumference(float n) {
        float circum = 2f;
        float pi = 3.14f;
        float res = circum * pi;
        float result = (n * n) * res;
        System.out.println("Circumference : " + result);
        
    }

    // 3. Return The greater Of Two Number.
    public static void GreaterOfTwoNum(int a, int b) {
        if (a > b) {
            System.out.println("The Greater Number Is : " + a);
        } else {
            System.out.println("The Greater Number Is : " + b);
        }
    }

    // 2.Function To add the sum of all odd number from 1 - n.
    public static void SumOfAllOddNum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                count = count + i;
        }
        System.out.println(count);
    }

    // 1. Take 3 Num From User and Print The Average
    public static void AverageOfThreeNum(int a, int b, int c) {
        int result = (a + b + c) / 2;
        System.out.println("AverageOfThreeNum : " + result);
    }
}
