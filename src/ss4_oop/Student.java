package ss4_oop;


import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String address;
    private static String nameSchool;

    static {
        nameSchool = "School";
    }

//    Overload
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {

    }

    public Student(int id, String name) {
        this(1, "HaiTT", "Quảng Nam");
        this.id = id;
        this.name = name;
    }

    public Student(byte id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, String address, Double point){

    }

    public void study() {
        move();
        System.out.println("Học");
        move();
    }

    public void move() {

    }

    public static void main(String[] args) {
        Student huong = new Student();
        Student quoc = new Student();
        quoc.nameSchool = "CodeGym";
        huong.nameSchool="CodeGym";

        huong.nameSchool="CodeGymVN";
        System.out.println(quoc.nameSchool);


    }

////    nested class
//    public static class Account {
//
//    }
}
