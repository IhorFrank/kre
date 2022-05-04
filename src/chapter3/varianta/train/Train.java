package chapter3.varianta.train;

import java.time.LocalTime;


//Train: Пункт назначения, Номер поезда, Время отправления, Число мест
//(общих, купе, плацкарт, люкс).
//Создать массив объектов. Вывести:
//a) список поездов, следующих до заданного пункта назначения;
//
//b) список поездов, следующих до заданного пункта назначения и отправ-
//ляющихся после заданного часа;
//
//c) список поездов, отправляющихся до заданного пункта назначения
//и имеющих общие места.
public class Train {

    private String destination;
    private StringBuilder numberTrain;
    private LocalTime departureTime;
    private int numberOfGeneralPlaces;
    private int numberOfCoupePlaces;
    private int numberOfReservedSeadPlaces;
    private int numberOfLuxuryPlaces;

    Train(String destination, StringBuilder numberTrain, LocalTime departureTime, int numberOfGeneralPlaces, int numberOfCoupePlaces , int numberOfReservedSeadPlaces, int numberOfLuxuryPlaces) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
        this.numberOfGeneralPlaces = numberOfGeneralPlaces;
        this.numberOfCoupePlaces = numberOfCoupePlaces;
        this.numberOfReservedSeadPlaces = numberOfReservedSeadPlaces;
        this.numberOfLuxuryPlaces = numberOfLuxuryPlaces;
    }

    public int getNumberOfLuxuryPlaces() {
        return numberOfLuxuryPlaces;
    }

    public void setNumberOfLuxuryPlaces(int numberOfLuxuryPlaces) {
        this.numberOfLuxuryPlaces = numberOfLuxuryPlaces;
    }

    public int getNumberOfReservedSeadPlaces() {
        return numberOfReservedSeadPlaces;
    }

    public void setNumberOfReservedSeadPlaces(int numberOfReservedSeadPlaces) {
        this.numberOfReservedSeadPlaces = numberOfReservedSeadPlaces;
    }

    public int getNumberOfCoupePlaces() {
        return numberOfCoupePlaces;
    }

    public void setNumberOfCoupePlaces(int numberOfCoupePlaces) {
        this.numberOfCoupePlaces = numberOfCoupePlaces;
    }

    public int getNumberOfGeneralPlaces() {
        return numberOfGeneralPlaces;
    }

    public void setNumberOfGeneralPlaces(int numberOfGeneralPlaces) {
        this.numberOfGeneralPlaces = numberOfGeneralPlaces;
    }

    public LocalTime getDepartureTime() {

        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public StringBuilder getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(StringBuilder numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", departureTime=" + departureTime +
                ", numberOfGeneralPlaces=" + numberOfGeneralPlaces +
                ", numberOfCoupePlaces=" + numberOfCoupePlaces +
                ", numberOfReservedSeadPlaces=" + numberOfReservedSeadPlaces +
                ", numberOfLuxuryPlaces=" + numberOfLuxuryPlaces +
                '}';
    }
}


