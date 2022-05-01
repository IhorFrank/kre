package chapter3.train;

import java.sql.Time;
import java.util.ArrayList;

public class RailwayStation {
    final private ArrayList<Train> train = new ArrayList<>();

    RailwayStation(String stationName) {
    }

    public void addTrain(Train t) {
        train.add(t);
    }

    ////a) список поездов, следующих до заданного пункта назначения;
    void getTrainDestination(String destination) {
        System.out.println("List of trains going to " + destination);
        for (Train t : train) {
            if (t.getDestination().equals(destination)) {
                System.out.println(t);
            }
        }
    }

    //b) список поездов, следующих до заданного пункта назначения и отправ-
    ///ляющихся после заданного часа;
    void getTrainDestinationAndTimeDeparture(String destination, Time departure) {
        System.out.println("List of trains going to " + destination + " after " + departure);
        for (Train t : train) {
            if (t.getDestination().equals(destination) && (t.getDepartureTime()).after(departure)) {
                System.out.println(t);
            }
        }
    }

    //    //c) список поездов, отправляющихся до заданного пункта назначения
//     и имеющих общие места.
    void getTrainDestinationAndWithGeneralPlaces(String destination) {
        System.out.println("List of trains going to " + destination + " with available general places ");
        for (Train t : train) {
            if (t.getDestination().equals(destination) && t.getNumberOfGeneralPlaces() > 0) {
                System.out.println(t);
            }
        }
    }
}
