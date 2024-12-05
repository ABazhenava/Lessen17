package by.itacademy.bazhenava.lessen17.Task10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Airline> airlines = new ArrayList<>();
        airlines.add(new Airline("Москва", "MOS888",
                "Boeing 737", "12:15", new String[]{"Пн", "Вт", "Чт"}));
        airlines.add(new Airline("Москва", "MOS123",
                "Boeing 737", "10:00", new String[]{"Пн", "Ср", "Пт"}));
        airlines.add(new Airline("Калининград", "KA456",
                "Airbus A320", "14:00", new String[]{"Вт", "Чт", "Вс"}));
        airlines.add(new Airline("Новосибирск", "HOV789",
                "Boeing 777", "16:00", new String[]{"Пн", "Ср", "Пт"}));
        airlines.add(new Airline("Минск", "M780",
                "Boeing 777", "10:00", new String[]{"Пн", "Ср"}));

        for (int i = 0; i < airlines.size(); i++) {
            Airline b = airlines.get(i);//books[i]
            String message = "Airline: destination=" + b.getDestination() + ", FlightNumber=" + b.getFlightNumber() +
                    ", aircraftType=" + b.getAircraftType() + ", departureTime=" + b.getDepartureTime() +
                    ", daysOfWeek=" + b.getDaysOfWeek();
            System.out.println(i + " - " + message);
        }

        AirlineAggregate aggregate = new AirlineAggregate(airlines);

        System.out.println("\nРейсы до Москвы:");
        List<Airline> flightsToMos = aggregate.getFlightsByDestination("Москва");
        aggregate.printAirlines(flightsToMos);

        System.out.println("\nРейсы по понедельникам:");
        List<Airline> mondayFlights = aggregate.getFlightsByDayOfWeek("Пн");
        aggregate.printAirlines(mondayFlights);

        System.out.println("\nРейсы по понедельникам после 12:00:");
        List<Airline> mondayAfternoonFlights = aggregate.getFlightsByDayOfWeekAndTime("Пн",
                "12:00");
        aggregate.printAirlines(mondayAfternoonFlights);
    }
}
