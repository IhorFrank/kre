package chapter3.varianta.car;

// id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
public class Car {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String Brand;
    private String Model;
    private int YearOfManufacture;
    private String Color;
    private double Price;
    private int RegistrationNumber;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        if (yearOfManufacture > 2000)
            this.YearOfManufacture = yearOfManufacture;
    }

    public int getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String toString() {
        return "Id: " + id + " Brand:" + getBrand() + " Model:" + getModel() + " Year Of Manufacture:" + getYearOfManufacture() +
                " Color:" + getColor() + " Price:" + getPrice() + " Registration Number: " + getRegistrationNumber();

    }

}
//    Car(int id, String brand, String model, int yearOfManufacture, String color, double price, int registrationNumber) {
//        this.id = id;
//        this.Brand = brand;
//        this.Model = model;
//        this.YearOfManufacture = yearOfManufacture;
//        this.Color = color;
//        this.Price = price;
//        this.RegistrationNumber = registrationNumber;
//    }
