package by.itacademy.bazhenava.lessen17.Task10;

import java.util.Arrays;

public class Airline {

    private String destination;
    private String flightNumber;
    private String aircraftType;
    private String departureTime;
    private String[] daysOfWeek;

    public Airline() {};

    Airline(String destination, String flightNumber, String aircraftType, String departureTime, String[] daysOfWeek) {
        super();
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" + "destination='" + destination + '\'' + ", flightNumber='"
                + flightNumber + '\'' + ", aircraftType='" + aircraftType + '\'' + ", departureTime='"
                + departureTime + '\'' + ", daysOfWeek=" + Arrays.toString(daysOfWeek) + '}';
    }
}
