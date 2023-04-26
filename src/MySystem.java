import java.util.Scanner;
import java.util.ArrayList;

public class MySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        StudentManager studentManager = new StudentManager();
        studentManager.addClassroom();
        studentManager.addGender();
//        studentManager.addStudents();
        studentManager.loadAccountsFromFile("Student.txt");
        studentManager.loadClassroomFromFile("Classroom.txt");


        int choice;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Thêm sinh viên: ");
            System.out.println("2. Sửa thông tin sinh viên theo id: ");
            System.out.println("3. Xóa một sinh viên theo id: ");
            System.out.println("4. Hiển thị tất cả các sinh viên: ");
            System.out.println("5. Hiển thị tất cả sinh viên theo Classroom: ");
            System.out.println("6. Hiển thị tất cả sinh viên + thông tin học lực dựa theo điểm trung bình");
            System.out.println("7. Hiển thị tất cả sinh viên có điểm: 1 - Cao nhất, 2 - Thấp nhất");
            System.out.println("8. Tìm kiếm sinh viên theo tên gần đúng");
            System.out.println("9. Hiển thị tất cả sinh viên theo giới tính");
            System.out.println("10. Classroom");
            System.out.println("11. Thao tác với CLassroom");
            System.out.println("0. Thoát ");
            System.out.println("9.----------------------------------------------");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.createStudent();
                    break;
                case 2:
                    studentManager.updateStudent();
                    break;
                case 3:
                    studentManager.deleteStudent();
                    break;
                case 4:
                    studentManager.displayAll();
                    break;
                case 5:
                    studentManager.displayClassroom();

                    break;
                case 6:
                    studentManager.displayAllAvgPoint();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    studentManager.displayGender();
                    break;
                case 10:
                    break;
                case 11:
                    subMenu(studentManager, scanner);
                case 0:
                    System.exit(0);
            }

        } while (true);
    }

    public static void subMenu(StudentManager studentManager, Scanner scanner) {
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. tạo mới 1 CLassroom");
            System.out.println("2. sửa Classroom theo id");
            System.out.println("3. xóa Classroom theo id");
            System.out.println("4. hiển thị Classroom by id");
            System.out.println("5. hiển thị tất cả  Classroom");
            System.out.println("0. thoát");
            System.out.println("nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.createClassroom();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    studentManager.displayAllClassroom();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }while (true);


    }
}