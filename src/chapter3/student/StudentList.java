package chapter3.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student s) {
        studentsList.add(s);
    }

    //a) список студентов заданного факультета;
    public void facultyPrint(String faculty) {
        System.out.println("List of students faculty : " + faculty);
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st);
            }
        }
    }

    //b) списки студентов для каждого факультета и курса;
    public void facultyAndCoursePrint(String faculty, int course) {
        System.out.println("List of students faculty: " + faculty + "  and course :" + course);
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty) && st.getCourse() == course) {
                System.out.println(st);
            }
        }
    }

    //c) список студентов, родившихся после заданного года;
    public void birthdayStudentPrint(int yearOfBirth) {
        System.out.println("List of student over " + yearOfBirth + " year of birth");
        for (Student st : studentsList) {
            if (st.getYearOfBirth()>yearOfBirth) {
                System.out.println(st);
            }
        }
    }
    //d) список учебной группы.
    public void  groupStudentPrint (String group){
        System.out.println("List of student group: " + group );
        for (Student st : studentsList){
            if(st.getGroup().equals(group)){
                System.out.println(st);
            }
        }
    }
}

