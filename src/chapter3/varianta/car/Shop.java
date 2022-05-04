package chapter3.varianta.car;

import java.util.ArrayList;
import java.util.Calendar;


public class Shop {
    private final ArrayList<Car> carsShop = new ArrayList<>();

    Shop(String shopName) {
    }

    void addCarToShop(Car c) {
        carsShop.add(c);
    }

    //a) список автомобилей заданной марки;
    void getCarBrand(String brand) {
        System.out.println("List of " + brand + " brand cars");
        for (Car s : carsShop) {
            if (s.getBrand().equals(brand)) {
                System.out.println(s);
            }
        }

    }
    //b) список автомобилей заданной модели, которые эксплуатируются боль-
    //ше n лет;

    void getCarBrandAndOverYears(String brand, int year) {
        System.out.println("List of " + brand + " brand cars and release over " + year + " years");
        for (Car s : carsShop) {
            if (s.getBrand().equals(brand) && (Calendar.getInstance().get(Calendar.YEAR) - s.getYearOfManufacture()) > year) {
                System.out.println(s);
            }
        }
    }

    //c) список автомобилей заданного года выпуска, цена которых больше ука-
    //занной.

    void getCarYearOfManufactureAndPriceOver(int year, double price) {
        System.out.println("List of cars " + year + " year and price over " + price);
        for (Car s : carsShop) {
            if (s.getYearOfManufacture() == year && s.getPrice() > price) {
                System.out.println(s);
            }
        }
    }

}
