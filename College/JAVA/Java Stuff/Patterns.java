
public class Patterns {
    public static void main(String[] args) {
        // // 4x4 matrix of * Solid rectangle
        // int row = 4;
        // int col = 4;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= col; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
        // ------------------------------------------------------------
        // 2. Hollow Rectangle

        // int row = 4;
        // int col = 4;
        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= col; j++) {
        // if (i == 1 || j == 1 || i == row || j == col) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // ---------------------------------------------------------------

        // 3.Half Pyramid
        // int num = 4;
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // ---------------------------------------------------------------
        // Inverted Half Pyramid

        // for (int i = 4; i >= 1; i--){
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // ----------------------------------------------------------
        // Half Pyramid Using Numbers
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // --------------------------------------------------------------
        // Inverted half Pyramid with Numbers
        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // ----------------------------------------------------------------
        // Floyd Triangle

        // int num = 5;
        // int count = 1;
        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" "+count);
        // count ++;
        // }
        // System.out.println();
        // }
        // ----------------------------------------------------------------

        // 0s and 1s triangle

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i+j) % 2 == 0) {
        // System.out.print(" 1 ");
        // } else {
        // System.out.print(" 0 ");
        // }
        // }
        // System.out.println();
        // }

        // Butterfly Pattern.
        // -----------------------------------------------------------------

        // // Upper half
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // 1st Part
        // for (int a = 1; a <= i; a++) {
        // System.out.print("*");
        // }
        // // Spaces
        // int space = 2 * (n - i);
        // for (int b = 1; b <= space; b++) {
        // System.out.print(" ");
        // }
        // // 2nd part
        // for (int c = 1; c <= i; c++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Lower Half
        // for (int i = n; i >= 1; i--) {
        // for (int a = 1; a <= i; a++) {
        // System.out.print("*");
        // }
        // int space = 2 * (n - i);
        // for (int b = 1; b <= space; b++) {
        // System.out.print(" ");
        // }
        // for (int c = 1; c <= i; c++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // -------------------------------------------------------

        // Solid Rhombus
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int a = n; a >= i; a--) {
        // System.out.print(" ");
        // }
        // for (int a = 1; a <= n; a++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // ---------------------------------------------------------

        // Number Pyramid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // Space
        // for (int j = n; j >= i; j--) {
        // System.out.print(" ");
        // }
        // // print number -> print not of rows ,
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        // -------------------------------------------------------------
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     // Space
        //     for (int j = n; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     // print number -> print not of rows ,
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // ------------------------------------------------------------



        //          v
        //         v v
        //       v  v  v
        //     v  v v v  v
        //     v  v v v  v
        //       v  v  v
        //        v  v
        //         v
         
        // Diamond Shape Pattern

        int n = 5;
            // upper side
            for (int i = 1; i <= n; i++) {
                // Space
                for (int j = n; j >= i; j--) {
                    System.out.print(" ");
                }
                // print number -> print not of rows ,
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        
            // lower side
            for (int i = n; i >= 1; i--) {
                // Space
                for (int j = n; j >= i; j--) {
                    System.out.print(" ");
                }
                // print number -> print not of rows ,
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
