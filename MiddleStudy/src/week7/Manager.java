package week7;

import week7.models.*;

import java.util.Scanner;

public class Manager {
    private static Student[] arrStudents;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStudentCount = 0;
        do {
            System.out.print("최대인원:");
            maxStudentCount = Integer.parseInt(scanner.nextLine());

        }
        while (maxStudentCount < 1);{
            arrStudents = new Student[maxStudentCount];
            for (int i = 0; i < maxStudentCount; i++) {
                System.out.println("학번 :");
                var id = scanner.nextLine();
                System.out.println("이름:");
                var name = scanner.nextLine();

                arrStudents[i] = new Student(id, name);

            }
        }
    }
}
