package com.formula1.api.service;

import com.formula1.api.domain.race.Race;
import com.formula1.api.dto.RaceDTO;
import com.formula1.api.repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {

    private final RaceRepository raceRepository;
    public RaceService(RaceRepository raceRepository){
        this.raceRepository = raceRepository;
    }

    public void saveRace(Race race){
        this.raceRepository.save(race);
    }

    public Race createRace(RaceDTO data){
        Race newRace = new Race(data);
        this.saveRace(newRace);
        return newRace;
    }

    public List<Race> getAllRaces(){
        return this.raceRepository.findAll();
    }
}
