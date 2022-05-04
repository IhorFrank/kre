package chapter3.varianta.car;

//Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
//Создать массив объектов. Вывести:
//a) список автомобилей заданной марки;
//
//b) список автомобилей заданной модели, которые эксплуатируются боль-
//ше n лет;
//
//c) список автомобилей заданного года выпуска, цена которых больше ука-
//занной.
public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Opel");
        car.setModel("Vectra");
        car.setYearOfManufacture(2011);
        car.setColor("Black");
        car.setPrice(26000);
        car.setRegistrationNumber(2345);

        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setModel("X3");
        car1.setYearOfManufacture(2020);
        car1.setPrice(48000);

        Car car2 = new Car();
        car2.setBrand("Opel");
        car2.setModel("Vivaro");
        car2.setYearOfManufacture(2020);
        car2.setPrice(40000);


        Shop vidiService = new Shop("VidiService");
        vidiService.addCarToShop(car);
        vidiService.addCarToShop(car1);
        vidiService.addCarToShop(car2);

        vidiService.getCarBrand("Opel");
        vidiService.getCarBrand("BMW");
        vidiService.getCarBrandAndOverYears("Opel", 1);
        vidiService.getCarBrandAndOverYears("BMW", 2020);
        vidiService.getCarYearOfManufactureAndPriceOver(2020, 45000);


    }
}
