package website.zaripov.sololearn;

import java.util.HashMap;

public class StringsTest {

    static void f1() {
        String s = "123asdfghj@gmail.com";
        if (s.substring(s.length() - 5).equals(".com")) {
            System.out.println(s.substring(1));
        } else {
            System.out.println("y.length()"); //y.length()      ----> ;)
        }
    }

    static void f2() {
        int x, y;
        double z;
        x = 5;
        y = x * 2;
        z = x / 2 + y;
        System.out.println(z); //12.0
    }

    static void f3() {
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        points.put("Rob", 403);
        System.out.println(points.get("ROB")); //null

    }

    private static int f4(int i) {  //5
        if (i <= 1) {
            return 1;
        } else {
            return (2 + f4(i - 1));
        }
    }

    static void f5() {
        int n = 15, s = 0, x;
        for (int i = 0; i <= n; i++) {
            x = n % 10;
            s = s + x;
            n = n / 10;
        }
        System.out.println(s); //6
    }

    static void f6() {
        String s1 = "Sololearn";
        String s2 = "sololearn";
        boolean b = false, b1 = true;
        char ch = 91;
        System.out.println(ch);
        if (s1.toLowerCase().equals(s2)) {
            b = !b;
        }
        if (s1.charAt(6) == ch) {
            b1 = false;
        }
        System.out.println(b + "\n" + b1);

    }

    static void ascii() {
        char ch = 33;
        for (int i = 33; i < 128; i++) {
            System.out.println((ch++) + ": " + i);
        }
    }

    static void f7() {
        int i = (int) Math.random();
        System.out.println(i);
        double d = Math.random();
        System.out.println(d);
        i = (int) (Math.random() * 10);
        System.out.println(i);
        i = (int) (Math.random() + 0.5);
        System.out.println(i);
    }

    long[] fix(long[] a3) {
        a3[1] = 7;
        return a3;
    }

    void start() {
        long[] a1 = {3, 4, 5};
        long[] a2 = fix(a1);
        System.out.println(a1[0] + a1[1] + a1[2] + " "); //15
        System.out.println(a2[0] + a2[1] + a2[2]); //15
    }

    static int f8(int x) {  //5
        if (x == 0) {
            return 2;
        } else {
            return 1 + f8(x - 1);
        }
    }

    static void f9() {
        int[] is = {0, 1, 2};
        double[] ds = {1.0, 1.1, 1.2};
        int x = is.length, y = ds.length;
        System.out.println(x + " : " + y);
        int max = Math.max(is.length, ds.length);
        int sum = 0;
        for (int i = 0; i < max; i++) {
            sum = 10;
            sum += is[i] + ds[i];
        }
        System.out.println(sum);
    }

    static void f10() {
        int[] num = new int[9];
        int i;
        for (i = - 1; i < num.length - 1;) {
            num[++i] = i;
        }
        String res = "" + num[2] + (4 % 2) + (5 % 2) + i;
        System.out.println(res); //2018
    }

    static void f11() {
        int index;
        int[] pixels = new int[10000];
        for(int y = 0; y < 100; y++) {
            for(int x = 0; x < 100; x++) {
                index = x + y*100;
                pixels[index] = x + y;  
            }
        }
        System.out.println(pixels[150]); //51
    }

    public static void main(String[] args) {
        StringsTest st = new StringsTest();
        //System.out.println(f8(3));
    }
}
