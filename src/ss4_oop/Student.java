package ss4_oop;


public class Student {
    int id;
    String name;
    String address;

//    Overload
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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
        Student student = new Student();
    }
}
