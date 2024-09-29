package com.formula1.api.controller;


import com.formula1.api.domain.race.Race;
import com.formula1.api.dto.RaceDTO;
import com.formula1.api.service.RaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/race")
public class RaceController {

    private final RaceService raceService;
    public RaceController(RaceService raceService){
        this.raceService = raceService;
    }

    @PostMapping
    public ResponseEntity<Race> createRace(@RequestBody RaceDTO data){
        Race newRace = this.raceService.createRace(data);
        return new ResponseEntity<>(newRace, HttpStatus.CREATED);
    }

}
