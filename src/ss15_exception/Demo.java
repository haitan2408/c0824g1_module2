package ss15_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
       int id = new Demo().inputPropertyNumberInteger("id");
        System.out.println(id);
    }

    public static void read () throws FileNotFoundException {
        File file = new File("");
        FileReader reader = new FileReader(file);
    }

    public int inputPropertyNumberInteger(String key){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập " + key + ":");
        int value ;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn cần nhập định dạng số");
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        }
        return value;
    }
}
