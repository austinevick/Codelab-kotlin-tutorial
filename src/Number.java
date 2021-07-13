import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        int[] names = new int[7];
        names[0] = 11;
        names[1] = 11;
        names[2] = 23;
        names[3] = 54;
        names[4] = 14;
        names[5] = 31;
        names[6] = 16;
        for (int i = 0; i < names.length; i++) {
            System.out.println(i+1+"-"+ names[i]);
        }
    }
}