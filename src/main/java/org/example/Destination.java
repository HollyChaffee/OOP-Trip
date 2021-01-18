package org.example;

import org.example.exceptions.InsufficientFundsException;

public class Destination {

    private String name;
    private Double distance;
    private Double costPerMile;
    private Boolean requireCovidTest;

    public Destination(String name, Double distance, Double costPerMile, Boolean requireCovidTest) {
        this.name = name;
        this.distance = distance;
        this.costPerMile = costPerMile;
        this.requireCovidTest = requireCovidTest;
    }

    public void allowToVisit(Traveler traveler) throws InsufficientFundsException {
        Double costToTravel = distance * costPerMile;
        Double moneyTravelerHas = traveler.getMoney();
        if (moneyTravelerHas < costToTravel) {
            throw new InsufficientFundsException();

        }
    }

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public Double getDistance() {
            return distance;
        }

        public void setDistance(Double distance){
            this.distance = distance;
        }

        public Double getCostPerMile() {
            return costPerMile;
        }

        public void setCostPerMile(Double costPerMile){
            this.costPerMile = costPerMile;
        }

        public Boolean getRequireCovidTest() {
            return requireCovidTest;
        }

        public void setRequireCovidTest(Boolean requireCovidTest){
            this.requireCovidTest = requireCovidTest;
        }
    }

