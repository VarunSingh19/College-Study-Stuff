import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // SolveProblemOne();
        // SolveProblemTwo();

        // Always remember Java Strings Are Immutable. means they cant be changed! 

        // ParseInt Method.
        // String num = "123";
        // int number = Integer.parseInt(num);
        // System.out.println(number);
        // int result = number + number;
        // System.out.println("Square Numbers: " + result);

        // ToString Method
        // int num1 = 1234;
        // String str = Integer.toString(num1);
        // System.out.println(str);
        // String Strrr = str + str;
        // System.out.println(Strrr);

    }

    public static void SolveProblemThree() {
        
    }




    public static void SolveProblemTwo() {
        // Solve Problem Two
        // Input a string from the user. create a new string called "result" 
        // in which you will replace the letter "e" in the og string with letter "i".
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = sc.next();
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += name.charAt(i);
            }

        }
        System.out.println(result);


    }




    public static void SolveProblemOne(){

        // Solve Problem 1.
        // Take An Array Of String Input from The user & find the cumulative (combines) 
        // length of all those strings
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Space of Strings :");
        int size = sc.nextInt();
        String mystr[] = new String[size];
        
        
        int totlength = 0;
        System.out.println("Enter the "+ size +" Strings");
        for (int i = 0; i < size; i++) {
            mystr[i] = sc.next();
            totlength += mystr[i].length();
        }
        System.out.println(totlength);
    }
}












// ---------------------------------------------------------------------------------------
// import java.util.Scanner;



// public class Strings {
//     public static void main(String[] args) {
//         //String Declaration
//         // String name = "Varun";
//         // String FullName "Varun Singh";
//         // String sentence = "This is A sentence";

//         // StringName();
//         // StringConcatination();
//         // Stringlength();


//         // charAt
//         // String FirstName = "Tony";
//         // String LastName = "Stark";
//         // String Fullname = FirstName + " " + LastName;
//         // for (int i = 0; i < Fullname.length(); i++) 
//         // {
//         //     System.out.println(Fullname.charAt(i));
//         // }

//         StringComparison();
//     }
    
//     public static void StringComparison() {
//         // cases
//         // s1 > s2    : +ve value
//         // s1 == s2   : 0
//         // s1 < s2    : -ve value

//         String FirstName = "Tony";
//         String LastName = "Stark";

//         // .CompareTo method
//         // if (FirstName.compareTo(LastName) == 0) {
//         //     System.out.println("String Are Equal");
//         // } else {
//         //     System.out.println("Not Equal");
//         // }

//         // if (new String("Varun") == new String("Varun")) {
//         //     System.out.println("Equal");
//         // } else {
//         //     System.out.println("Not Equal");
//         // }


//         //Substring Method.
//         String Sentence = "My Name Is Varun Singh";
//         // substring(beggining index,ending index);
//         // 
//         String name = Sentence.substring(11, Sentence.length());
//         System.out.println(name);
//     }

//     public static void Stringlength() {
//         String FirstName = "Tony";
//         String LastName = "Stark";
//         String Fullname = FirstName +" "+ LastName;
//         System.out.println(Fullname.length());
//     }


//     public static void StringConcatination() {
//         String FirstName = "Tony";
//         String LastName = "Stark";
//         String Fullname = FirstName +" "+ LastName;
//         System.out.println(Fullname);

//     }


//     public static void StringName(){

//         // take String as input
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name:");
//         // String name = sc.next(); //For single token of string
//         String name = sc.nextLine();
//         System.out.println("Your Name Is: "+ name);
//     }
// }
