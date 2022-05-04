package chapter3.varianta.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private final List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student s) {
        studentsList.add(s);
    }

    //a) список студентов заданного факультета;
    public void printFaculty(String faculty) {
        System.out.println("List of students faculty : " + faculty);
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st);
            }
        }
    }

    //b) списки студентов для каждого факультета и курса;
    public void printFacultyMathCourse2() {
        System.out.println("List of students faculty Math course 2: ");
        for (Student st : studentsList) {
            if (st.getFaculty().equals("Math") && st.getCourse() == 2) {
                System.out.println(st);
            }
        }
    }

    public void printFacultyPhilosophyCourse1() {
        System.out.println("List of students faculty Philosophy course 1: ");
        for (Student st : studentsList) {
            if (st.getFaculty().equals("Philosophy") && st.getCourse() == 1) {
                System.out.println(st);
            }
        }
    }

    //c) список студентов, родившихся после заданного года;
    public void printStudentBornAfter(int year) {
        System.out.println("List of student over " + year + " year of birth");
        for (Student st : studentsList) {
            if (st.getBirthday().getYear() > year) {
                System.out.println(st);
            }
        }
    }

    //d) список учебной группы.
    public void printGroupStudent(String group) {
        System.out.println("List of student group: " + group);
        for (Student st : studentsList) {
            if (st.getGroup().equals(group)) {
                System.out.println(st);
            }
        }
    }
}

