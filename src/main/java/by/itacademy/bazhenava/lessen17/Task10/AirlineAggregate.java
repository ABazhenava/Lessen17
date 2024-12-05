package by.itacademy.bazhenava.lessen17.Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirlineAggregate {
    List<Airline> airlines = new ArrayList<>();

    public AirlineAggregate(List<Airline> airlines) {
        this.airlines = airlines;
    }

    //  список рейсов для заданного пункта назначения
    public List<Airline> getFlightsByDestination(String destination) {
        List<Airline> result = new ArrayList<>();

        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                result.add(airline);
            }
        }
        return result;
    }

    // список рейсов для заданного дня недели
    public List<Airline> getFlightsByDayOfWeek(String dayOfWeek) {
        List<Airline> result = new ArrayList<>();
        for (Airline airline : airlines) {
            if (Arrays.asList(airline.getDaysOfWeek()).contains(dayOfWeek)) {
                result.add(airline);
            }
        }
        return result;
    }

    // список рейсов для заданного дня недели, время вылета больше заданного
    public List<Airline> getFlightsByDayOfWeekAndTime(String dayOfWeek, String time) {
        List<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlines) {
            if (Arrays.asList(airline.getDaysOfWeek()).contains(dayOfWeek)
                    && airline.getDepartureTime().compareTo(time) > 0) {
                result.add(airline);
            }
        }
        return result;
    }

    public void printAirlines(List<Airline> airlines) {
        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }
}
