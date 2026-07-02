package operator;

public class jiadeng {
    public static void main(String[] args) {
        //+=
        //把左边和右边进行相加，然后再把结果赋值给左边
        int a = 10;
        int b = 30;
        a += b;
        //等于a = short(a + b)
        System.out.println(a);
        System.out.println(b);

        //细节：
        short s = 1;
        //把左边和右边进行相加，得到结果2，再赋值给左边的变量
        s += 1;
        //等同于： s = (short)(s + 1)
        System.out.println(s);
    }
}
