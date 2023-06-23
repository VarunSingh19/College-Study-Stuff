public class Learning {
    public static void main(String[] args) {
        // FindBit();
        SetBit();
    }
    public static void SetBit() {
        //Find The ith Bit.
        int num = 15; //00001111
        int n = 4;
        int mask = 1 << n; //00010000
        int res = num | mask;
        if (res == ) {
            System.out.println("0 is set to 1");
        } else {
            System.out.println("failed.");
        }
        
    }




    public static void FindBit() {
        //Find The ith Bit.
        int num = 15; //00001111
        int n = 3;
        int mask = 1 << n; //00001000
        int res = num & mask;
        if (res == 0) {
            System.out.println("The nth bit of the num is 0");
        } else {
            System.out.println("the nth bit of num is 1");
        }
        
    }
    
}
