package ss7_abstract;

public class Student extends Person implements IStudent, IPerson {
    private double point;
    private String email;

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("Đi học");
    }

    public Student(int id, String name, String address, double point, String email) {
        super(id, name, address);
        this.point = point;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    @Override
    public String toString() {

        return  "Student{" +
                "point=" + point +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void study() {

    }
}
