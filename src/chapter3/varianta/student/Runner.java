package chapter3.varianta.student;


import java.time.LocalDate;
import java.time.Month;

public class Runner {
    public static void main(String[] args) {

        Student st1 = new Student(1, "Ivanov", "Ivan", "Jovanovich", LocalDate.of(2000, Month.AUGUST,12),
                "Kyiv", 67_450_29_22, "Math", 2, "MT1");
        Student st2 = new Student(2, "Petrov", "Petr", "Petrovich", LocalDate.of(2002,Month.JULY,12),
                "Kyiv", 67_123_22_21, "Philosophy", 1, "PH2");
        Student st3 = new Student(3, "Andreev", "Andrei", "Andreevich", LocalDate.of(2001,Month.AUGUST,1),
                "Kyiv", 67_474_22_89, "Math", 2, "MT1");


        StudentList students = new StudentList();
        students.addStudent(st1);
        students.addStudent(st2);
        students.addStudent(st3);

        students.printFaculty("Math");
        students.printFacultyMathCourse2();
        students.printFacultyPhilosophyCourse1();
        students.printStudentBornAfter(2001);
        students.printGroupStudent("MT1");
    }
}

