package com.formula1.api.domain.team;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Team {
    private Long id;
    private String name;
    private String country;
    private String foundedYear;
    private String principal;
    private String championshipWon;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getChampionshipWon() {
        return championshipWon;
    }

    public void setChampionshipWon(String championshipWon) {
        this.championshipWon = championshipWon;
    }

    public Team(){}

    public Team(Long id, String name, String country, String foundedYear, String principal, String championshipWon) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.foundedYear = foundedYear;
        this.principal = principal;
        this.championshipWon = championshipWon;
    }
}
