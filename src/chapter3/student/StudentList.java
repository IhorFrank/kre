package chapter3.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public List<StudentConstructor> studentsList = new ArrayList<>();

    public void addStudent(StudentConstructor s) {
        studentsList.add(s);
    }

    //a) список студентов заданного факультета;
    public void printFaculty(String faculty) {
        System.out.println("List of students faculty : " + faculty);
        for (StudentConstructor st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st);
            }
        }
    }

    //b) списки студентов для каждого факультета и курса;
    public void printFacultyMathCourse2() {
        System.out.println("List of students faculty Math course 2: " );
        for (StudentConstructor st : studentsList) {
            if (st.getFaculty().equals("Math") && st.getCourse() == 2) {
                System.out.println(st);
            }
        }
    }
    public void printFacultyPhilosophyCourse1() {
        System.out.println("List of students faculty Philosophy course 1: " );
        for (StudentConstructor st : studentsList) {
            if (st.getFaculty().equals("Philosophy") && st.getCourse() == 1) {
                System.out.println(st);
            }
        }
    }

    //c) список студентов, родившихся после заданного года;
    public void printStudentBornAfterYears(int yearOfBirth) {
        System.out.println("List of student over " + yearOfBirth + " year of birth");
        for (StudentConstructor st : studentsList) {
            if (st.getYearOfBirth()>yearOfBirth) {
                System.out.println(st);
            }
        }
    }
    //d) список учебной группы.
    public void printGroupStudent(String group){
        System.out.println("List of student group: " + group );
        for (StudentConstructor st : studentsList){
            if(st.getGroup().equals(group)){
                System.out.println(st);
            }
        }
    }
}

