package operator;

import java.util.Scanner;

public class review1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int ge = sz%10;
        int shi = sz/10;
        System.out.println(""+ge+shi);
    }
}
