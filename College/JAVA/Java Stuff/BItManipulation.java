// Number to Binary.
// 1. 001
// 2. 010
// 3. 011
// 4. 100
// 5. 101
// 6. 110
// 7. 111
// 8. 1000
// 9. 1001
// 10. 1010
// 11. 1011
// 12. 1100
// 13. 1101
// 14. 1110
// 15. 1111

import java.util.Scanner;

public class BItManipulation {
    public static void main(String[] args) {

        // Get Bit.

        // int n = 5; //0101
        // int pos = 2;
        // int bitmask = 1 << pos; //1 = 0001 =after left shift output: 0100
        // int res = bitmask & n;
        // System.out.println(res);
        // if ((bitmask & n) == 0) {
        // //here we are using & bit to add the output(bitmask) (and n which is 5) then
        // we get the output as 0100 (which is 4)
        // System.out.println("Bit Was Zero "+ res);
        // } else {
        // System.out.println("Bit Was One "+ res);
        // }
        // --------------------------------------------------------------------

        // Set Bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newInteger = bitMask | n;
        // System.out.println(newInteger);

        // ----------------------------------------------------------------

        // Clear Bit.
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos; //0100
        // int NotBitMask = ~(bitMask); // 1011
        // int res = NotBitMask & n; //0001 which is 1 in decimal
        // System.out.println(res);

        // ----------------------------------------------------------------

        // if ope = 1 then set method if ope = 0 then clear method.
        // Update Bit.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operation");
        int ope = sc.nextInt(); // Update bit to 1 else update bit to 0.

        int n = 5;
        int pos = 1;

        if (ope == 1) {
            int bitMask = 1 << pos;
            int newInteger = bitMask | n;
            System.out.println(newInteger);
        } else if (ope == 0) {
            int bitMask = 1 << pos; // 0100
            int NewBitMask = ~(bitMask); // 1011
            int res = NewBitMask & n; // 0001 which is 1 in decimal
            System.out.println(res);
        } else {
            System.out.println("Wrong Input");
        }

    }
}
