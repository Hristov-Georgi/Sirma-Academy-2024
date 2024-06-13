package classes.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String inputData = sc.nextLine();

        while (!inputData.equals("end")) {

            String[] studentData = inputData.split("\\s+");

            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            studentList.add(student);

            inputData = sc.nextLine();
        }

        String town = sc.nextLine();

        for (Student s : studentList) {

            if (s.getHomeTown().equals(town)) {
                System.out.printf("%s %s is %d years old%n",
                        s.getFirstName(), s.getLastName(), s.getAge());
            }

        }

    }

}
