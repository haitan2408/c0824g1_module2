package ss8_clean_code;


public class Student {
    private long code;
    private String name;
    private String address;
    private  String nameSchool;


    public Student(long code, String name, String address) {
        this.code = code;
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

    public Student(long code, String name) {
        this.code = code;
        this.name = name;
    }


    public Student(int code, String name, String address, Double point){

    }


    public static void main(String[] args) {
        Student huong = new Student();
        Student quoc = new Student();
        quoc.nameSchool = "CodeGym";
        huong.nameSchool="CodeGym";

        huong.nameSchool="CodeGymVN";
        System.out.println(quoc.nameSchool);


    }

}
