package com.formula1.api.domain.race;

import com.formula1.api.dto.RaceDTO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int numberOfLaps;
    private int trackLength;
    private int totalDistance;


    public Race(Long id, String name, int numberOfLaps, int trackLength, int totalDistance) {
        this.id = id;
        this.name = name;
        this.numberOfLaps = numberOfLaps;
        this.trackLength = trackLength;
    }

    public Race(RaceDTO data){
        this.name = data.name();
        this.numberOfLaps = data.numberOfLaps();
        this.trackLength = data.trackLength();
        this.totalDistance = data.totalDistance();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }

    public void setNumberOfLaps(int numberOfLaps) {
        this.numberOfLaps = numberOfLaps;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Race(){}




}
