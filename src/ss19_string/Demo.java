package ss19_string;

public class Demo {
    public static void main(String[] args) {
        String a = "Tan Hai";
        String b = "Hai";
//        System.out.println(a == b);
        String regex = "^[A-Za-z ]{5,50}$";
        String phone ="^0[0-9]{9}$";
        System.out.println(a.matches(regex));
    }
}
