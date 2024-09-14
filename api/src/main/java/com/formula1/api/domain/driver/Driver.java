package com.formula1.api.domain.driver;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;


public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int driverNumber;
    private int teamId;
    private String nationality;
    private LocalDate dataOfBirth;
    private int wins;
    private int podiums;
    private int championships;


    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getDriverNumber(){
        return driverNumber;
    }

    public int getTeamId(){
        return teamId;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public int getWins() {
        return wins;
    }

    public int getPodiums() {
        return podiums;
    }

    public int getChampionships() {
        return championships;
    }



    public void setName(String name){
        this.name = name;
    }

    public void setDriverNumber(int driverNumber){
        this.driverNumber = driverNumber;
    }


    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setPodiums(int podiums) {
        this.podiums = podiums;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }



    public Driver(){}

    public Driver(Long id, String name, int driverNumber, int teamId, String nationality, LocalDate dataOfBirth, int wins, int podiums, int championships) {
        this.id = id;
        this.name = name;
        this.driverNumber = driverNumber;
        this.teamId = teamId;
        this.nationality = nationality;
        this.dataOfBirth = dataOfBirth;
        this.wins = wins;
        this.podiums = podiums;
        this.championships = championships;
    }
}
