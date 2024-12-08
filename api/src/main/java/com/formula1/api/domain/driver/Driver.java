package com.formula1.api.domain.driver;

import com.formula1.api.dto.DriverDTO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    public Driver(DriverDTO data) {
        this.name = data.name();
        this.driverNumber = data.driverNumber();
        this.teamId = data.teamId();
        this.nationality = data.nationality();
        this.dataOfBirth = data.dateOfBirth();
        this.wins = data.wins();
        this.podiums = data.podiums();
        this.championships = data.championships();
    }
}

