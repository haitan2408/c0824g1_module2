package mvc.view;

import mvc.controller.StudentController;
import mvc.entity.Student;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- Quản lý CodeGym ------------");
        System.out.println("1. Quản lý học sinh");
        System.out.println("2. Quản lý giảng viên");
        System.out.println("3. Thoát");
        System.out.println("Mời bạn nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                menuStudent();
                break;
            case 2:
                System.out.println("Quản lý giảng viên");
                break;
        }
    }

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        System.out.println("Menu quản lý học sinh");
        System.out.println("1. Hiển thị danh sách học sinh");
        System.out.println("2. Thêm mới học sinh");
        System.out.println("3. Sửa thông tin học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Tìm kiếm học sinh theo tên hoặc id");
        System.out.println("6. Sắp xếp học sinh theo tên hoặc id");
        System.out.print("Nhập lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        int subChoice;
        List<Student> students;

        switch (choice) {
            case 1:
                System.out.println("Hiển thị danh sách học sinh");
                students = studentController.getAll();
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
                break;
            case 2:
                System.out.println("Thêm mới học sinh");
                break;
            case 3:
                System.out.println("Sửa thông tin học sinh");
                break;
            case 4:
                System.out.println("Xóa học sinh");
                break;
            case 5:
                System.out.println("Tìm kiếm học sinh theo tên hoặc id");
                break;
            case 6:
                System.out.println("Bạn muốn sắp xếp theo:");
                System.out.println("1. Theo tên");
                System.out.println("2. Theo id");
                subChoice = Integer.parseInt(scanner.nextLine());
                if (subChoice == 1) {
                    students = studentController.displayAllStudentSortById();
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }

                } else if (subChoice == 2) {

                } else {
                    System.out.println("Invalid");
                }
                break;
        }
    }
}
