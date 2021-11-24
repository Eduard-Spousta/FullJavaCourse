package cz._5_expressions;

public class Main {
    public static void main(String[] args){
        int a, b, c, g, h;
        double d, e, f;

        a = 12 + 5 * 3 - 7;                 // a = 20
        b = a;                              // b = 20
        c = b / 3;                          // c = 6
        c = c + 1;                          // c = 7
        c += 1;                             // c = 8
        d = c / 3.0;                        // d = 2.667
        e = d / 3;                          // e = 0.889
        f = b / (double) c;                 // f = 2.5
        g = (int) d / (int) f;              // g = 1
        h = a % 3;                          // h = 2
        // % what remain after dividing by 3

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);


        boolean i, j, k, l, m;

        i = a == b;                         // i = true
        j = d == e;                         // j = false
        k = i && j;                         // k = false
        l = i || j;                         // l = true
        m = !(i == l && !k || j);           // m = false

        System.out.println(i + " " + j + " " + k + " " + l + " " + m);

        System.out.println(2 + 3);          // 5
        System.out.println("2" + "3");      // 23
        System.out.println("2" + 3);        // 23
        System.out.println(2 + "3");        // 23
        System.out.println("1" + 2 + 3);    // 123
        System.out.println(1 + 2 + "3");    // 33
    }
}
