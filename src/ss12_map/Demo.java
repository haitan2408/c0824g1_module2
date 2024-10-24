package ss12_map;

import mvc.entity.Student;
import mvc.utils.sort.ComparatorStudentByName;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new ComparatorStudentByName());
        map.put(new Student(1, "Nguyễn Văn B", "Hà Nội", 10, "C0724G1"), 10);
        map.put(new Student(2, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"), 9);
        Set<Student> students = map.keySet();
        for (Student student: students) {
            System.out.println(map.get(student));
        }
    }
}
