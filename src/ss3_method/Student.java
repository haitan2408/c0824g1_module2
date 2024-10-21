package ss3_method;



public class Student {
    int id;
    String name;
    String address;
    static String nameSchool;

    public long diHoc() {
        return 0;
    }

    public void swap(int a,int b) {
        int c = a;
        a = b;
        b = c;
    }

    public static void main(String[] args) {
        Student s3 = getStudent();
        int c = 4;
        int d = 5;
        s3.swap(c, d);
    }

    public static Student getStudent() {
        Student s = new Student();
        s.nameSchool="CodeGym";
        Student s2 = new Student();
        s2.nameSchool="CodeGym";
        s.nameSchool = "CodegymVN";
        System.out.println(s2.nameSchool);
        System.out.println(s.nameSchool);
        Student s3 = new Student();
        s3.nameSchool="IVtect";
        return s3;
    }
}
