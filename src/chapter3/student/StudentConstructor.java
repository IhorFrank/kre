package chapter3.student;


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
public class StudentConstructor {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int datOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String address;
    private int phone;
    private String faculty;
    private int course;
    private String group;

     StudentConstructor(int id, String surname, String name, String patronymic, int datOfBirth, int monthOfBirth,
                       int yearOfBirth, String address,
                       int phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.datOfBirth = datOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
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

    public int getDatOfBirth() {
        return datOfBirth;

    }

    public void setBirthday(int datOfBirth) {
        if (datOfBirth > 0 && datOfBirth <= 31)
            this.datOfBirth = datOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth > 0 && monthOfBirth <= 12)
            this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 1980 && yearOfBirth < 2004)
            this.yearOfBirth = yearOfBirth;
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


    public String toString() {
        return "Student " + "id:" + id + ", name:" + name +  ", surname:" + surname +  ", patronymic:"
                + patronymic  + ", day:" + datOfBirth + ", month:" + monthOfBirth + ", year:" + yearOfBirth + ", " +
                "phoneNumber:+380" + phone + ", course:" + course + ", address:" + address +   ", faculty:"
                + faculty +", group:" + group;
    }
}
