package chapter3.student;


public class Runner {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Ivanov","Ivan","Jovanovich", 23,7,2002,
                "Kyiv",67_450_29_22,"Math",2,"MT1");
        Student st2 = new Student(2,"Petrov","Petr","Petrovich",10,8,2008,
                "Kyiv",67_123_22_21,"Philosophy",3,"PH2");
        Student st3 = new Student(3,"Andreev","Andrei","Andreevich",12,4,2003,
                "Kyiv",67_474_22_89,"Math",1,"MT1");
        StudentList students = new StudentList();
        students.addStudent(st1);
        students.addStudent(st2);
        students.addStudent(st3);


        students.facultyPrint("Math");
        students.facultyAndCoursePrint("Math",2);
        students.birthdayStudentPrint(2000);
        students.groupStudentPrint("MT1");
    }
}

