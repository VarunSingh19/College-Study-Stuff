public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloTwinkle");
        System.out.println(sb);
        System.out.println(sb.charAt(5));

        // setCharAt() is used to set the string at the perticular index.
        // setCharAt(position,character)
        sb.setCharAt(4, '@');
        System.out.println(sb);

        // insert() is used to push the string at a perticular location/index.
        // insert(position,character)
        sb.insert(0, 'F');
        System.out.println(sb);

        // Append Character
        // Apppend Means To add something at the end
        sb.append("varun");
        System.out.println(sb);

        // To find the length
        System.out.println(sb.length());


        // reverse a string.
        StringBuilder SB = new StringBuilder("Priyanka");
        for (int i = 0; i < SB.length() / 2; i++) {
            int front = i;
            int back = SB.length()-i-1;
            char FrontChar = SB.charAt(i);
            char BackChar = SB.charAt(back);

            SB.setCharAt(front, BackChar);
            SB.setCharAt(back, FrontChar);
        }
        System.out.println(SB);




        // StringBuilder mystr = new StringBuilder("VarunSingh");
        // StringBuilder newstr = new StringBuilder(" ");
        // System.out.println(mystr);
        // System.out.println(mystr.length());
        // int j = 0;
        // for (int i = mystr.length() - 1; i >= 0; i--) {
        //     newstr.insert(j, mystr.charAt(i));
        //     j++;
        // }
        // System.out.println(newstr);



    }
    
}
