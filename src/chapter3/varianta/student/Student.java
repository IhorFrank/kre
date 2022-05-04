package chapter3.varianta.student;


import java.time.LocalDate;

//Определить конcтрукторы и методы setТип(), getТип(), toString(). Определить дополнительно
//методы в классе, создающем массив объектов. Задать критерий выбора данных
//и вывести эти данные на консоль. В каждом классе, обладающем информацией,
//должно быть объявлено несколько конструкторов.
//Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
//Факультет, Курс, Группа.
//Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.
public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate birthday;
    private String address;
    private int phone;
    private String faculty;
    private int course;
    private String group;


    Student(int id, String surname, String name, String patronymic, LocalDate birthday,String address,
            int phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
