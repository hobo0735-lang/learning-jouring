package operator;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a = sc.nextInt();
        int aaa = a%10;
        int bbb = a/10%10;
        int ccc = a/10/10%10;
        System.out.println("它的个位是："+aaa);
        System.out.println("它的十位是："+bbb);
        System.out.println("它的百位是："+ccc);

    }
}

