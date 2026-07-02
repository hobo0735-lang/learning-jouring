package loop;

import java.util.Scanner;

public class dm2_2 {
    public static void main(String[] args) {
        System.out.println("请输入座位号");
        Scanner sc = new Scanner(System.in);
        int zuowei = sc.nextInt();
        if (zuowei >= 0 && zuowei <= 100){
            if (zuowei % 2 == 0){
                System.out.println("偶数，坐在右边");
            }else{
                System.out.println("奇数，坐在左边");
            }
        }else{
            System.out.println("走错地方了");
        }
    }
}
