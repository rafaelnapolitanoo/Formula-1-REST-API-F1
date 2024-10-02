package com.formula1.api.service;

import com.formula1.api.domain.driver.Driver;
import com.formula1.api.dto.DriverDTO;
import com.formula1.api.repository.DriverRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DriverService {


    private final DriverRepository driverRepository;
    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    public void saveDriver(Driver driver){
        this.driverRepository.save(driver);
    }

    public Driver createDriver(DriverDTO data){
        Driver newDriver = new Driver(data);
        this.saveDriver(newDriver);
        return newDriver;
    }

}
