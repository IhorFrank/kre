package chapter3.varianta.train;

import java.time.LocalTime;


public class Runner {
    public static void main(String[] args) {


        Train train = new Train("Lviv", new StringBuilder("123B"), LocalTime.of(21,1),22, 300,
                100, 250);
        Train train1 = new Train("Kyiv", new StringBuilder("112A"), LocalTime.of(14, 22),
                400, 200, 100, 40);
        Train train2 = new Train("Kyiv", new StringBuilder("13C"), LocalTime.of(12, 34), 0,
                200, 40, 20);


        RailwayStation railwayStation = new RailwayStation("Shevchenko");
        railwayStation.addTrain(train);
        railwayStation.addTrain(train1);
        railwayStation.addTrain(train2);


        railwayStation.getTrainDestination("Kyiv");
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestination("Lviv");
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestinationAndTimeDeparture("Lviv", LocalTime.of(20, 12));
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestinationAndTimeDeparture("Kyiv", LocalTime.of(12, 2));
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestinationAndWithGeneralPlaces("Kyiv");
    }
}