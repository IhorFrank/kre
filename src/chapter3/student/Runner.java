package chapter3.student;


public class Runner {
    public static void main(String[] args) {
        Student student = new Student();

        StudentList students = new StudentList();
        students.addStudent(student.st1);
        students.addStudent(student.st2);
        students.addStudent(student.st3);


        students.facultyPrint("Math");
        students.facultyMathCourse2Print();
        students.facultyPhilosophyCourse1Print();
        students.birthdayStudentPrint(2000);
        students.groupStudentPrint("MT1");
    }
}

