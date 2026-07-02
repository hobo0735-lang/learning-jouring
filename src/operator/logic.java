package operator;

import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        boolean  a = num1 == 6 || num2 ==6 || (num1+num2) % 6 == 0;
        System.out.println(a);

        String max = num1 == num2 ? "xt" : "nn";
        System.out.println(max);
    }
}
