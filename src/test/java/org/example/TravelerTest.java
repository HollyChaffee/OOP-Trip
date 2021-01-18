package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class TravelerTest {

    Traveler traveler;

    @Before
    public void setUp() throws Exception {
        String name = "Eduardo";
        String passPortNo = "12345";
        Double money = 40.00;
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(new Destination("Florida", 1000.0, 0.13, false));
        Boolean noFlyList = false;
        CovidResults covidResults = new CovidResults(new Date(), false);

        traveler = new Traveler(name, passPortNo, money, placesVisited, noFlyList, covidResults);
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getPassPortNo() {
    }

    @Test
    public void setPassPortNo() {
    }

    @Test
    public void getMoney() {
    }

    @Test
    public void setMoney() {
    }

    @Test
    public void getPlacesVisited() {
    }

    @Test
    public void setPlacesVisited() {
    }

    @Test
    public void isNoFlyList() {
    }

    @Test
    public void setNoFlyList() {
    }

    @Test
    public void getCovidResults() {
    }

    @Test
    public void setCovidResults() {
    }

    @Test
    public void bookATrip() {
    }
}