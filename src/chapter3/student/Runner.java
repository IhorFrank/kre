package chapter3.student;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Student student = new Student();


        StudentList students = new StudentList();
        for (StudentConstructor studentConstructor : Arrays.asList(student.st1, student.st2, student.st3)) {
            students.addStudent(studentConstructor);
        }

        students.printFaculty("Math");
        students.printFacultyMathCourse2();
        students.printFacultyPhilosophyCourse1();
        students.printStudentBornAfterYears(2000);
        students.printGroupStudent("MT1");
    }
}

