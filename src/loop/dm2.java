package loop;

import java.util.Scanner;

public class dm2 {
    public static void main(String[] args) {
        //输入一个整数，表示身上的钱。如果大于等于100元是餐厅，否则是沙县
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱");
        int money = sc.nextInt();
        if (money >= 100){
            System.out.println("有钱了，吃餐厅");
        }else{
            System.out.println("没钱，吃沙县");
        }
    }


}
