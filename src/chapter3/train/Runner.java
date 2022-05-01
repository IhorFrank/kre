package chapter3.train;

import java.sql.Time;


public class Runner {
    public static void main(String[] args) {
        Train train = new Train("Lviv", new StringBuilder("123B"), new Time(22, 12, 0), 300,
                100, 250, 50);
        Train train1 = new Train("Kyiv", new StringBuilder("112A"), new Time(11, 22, 0),
                400, 200, 100, 40);
        Train train2 = new Train("Kyiv", new StringBuilder("13C"), new Time(0, 34, 0), 0,
                200, 40, 20);


        RailwayStation railwayStation = new RailwayStation("Shevchenko");
        railwayStation.addTrain(train);
        railwayStation.addTrain(train1);
        railwayStation.addTrain(train2);


        railwayStation.getTrainDestination("Kyiv");
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestination("Lviv");
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestinationAndTimeDeparture("Lviv", new Time(20, 12, 0));
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestinationAndTimeDeparture("Kyiv", new Time(11, 2, 0));
        System.out.println("----------------------------------------------------");
        railwayStation.getTrainDestinationAndWithGeneralPlaces("Kyiv");
    }
}