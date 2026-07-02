package loop;

import java.util.Scanner;

public class dm4 {
    public static void main(String[] args) {
        System.out.println("请录入星期，今天是星期");
        Scanner week = new Scanner(System.in);
        int wk = week.nextInt();

        switch (wk){
            case 1:
                System.out.println("吃饭");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("骑行");
                break;
            case 4:
                System.out.println("旅游");
                break;
            case 5:
                System.out.println("睡觉");
                break;
            case 6:
                System.out.println("游泳");
                break;
            case 7:
                System.out.println("登山");
                break;
            default:
                System.out.println("没有这个星期");
        }

    }
}
