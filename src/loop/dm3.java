package loop;

import java.util.Scanner;

public class dm3 {
    public static void main(String[] args) {
        System.out.println("请输入会员等级：");
        int zj = 1000;
        Scanner sc = new Scanner(System.in);
        int hy = sc.nextInt();
        if (hy == 1){
            int jg1 = (int)(zj * 0.9);
            System.out.println("你是我们的会员一级，打九折，实际花费"+jg1);
        }else if(hy == 2){
            int jg2 = (int)(zj * 0.8);
            System.out.println("你是我们尊贵的会员二级，打八折，实际花费"+jg2);
        }else if(hy == 3){
            int jg3 = (int)(zj * 0.7);
            System.out.println("你是我们的至尊vip会员三级，打七折，实际花费"+jg3);
        }else{
            System.out.println("给你打骨折，实际花"+1000);
        }

    }
}
