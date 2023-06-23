import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter The Numebr Of Columns");
        int cols = sc.nextInt();
        
        int MyArr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                MyArr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The Number To Search using Linear Algo:");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (MyArr[i][j] == x) {
                    System.out.println("The Location Of X is at ("+ i +","+j+")");
                } else {
                    System.out.println("The Number Is Not found.");
                }
            }
        }
    }
}
