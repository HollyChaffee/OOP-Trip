package org.example;

import org.example.exceptions.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DestinationTest {

    Destination destination;

    @Before
    public void setUp() {
        destination = new Destination("Florida", 1000.0, 0.13, false);
    }

    @Test(expected = InsufficientFundsException.class)
    public void allowToVisit() {
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(destination);
        boolean noFlyList = false;
        CovidResults covidResults = new CovidResults(new Date(), false);

        Traveler traveler = new Traveler("Eduardo", "12345", 40.00,
                placesVisited, false, covidResults);
        destination.allowToVisit(traveler);
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getDistance() {
    }

    @Test
    public void setDistance() {
    }

    @Test
    public void getCostPerMile() {
    }

    @Test
    public void setCostPerMile() {
    }

    @Test
    public void getRequireCovidTest() {
    }

    @Test
    public void setRequireCovidTest() {
    }
}