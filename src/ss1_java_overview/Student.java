package ss1_java_overview;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 1;
        short c = 128;
        int d = a + b;
//        Tìm hiểu thêm lý do vì sao cộng vượt quá thì chuyển thành âm
//        System.out.println(d);

        double e = 300004398734856347856783456347856347854.5f;
        System.out.println(e);

        char f = '5';
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a);
    }
}
