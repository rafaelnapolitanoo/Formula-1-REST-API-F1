package com.formula1.api.repository;

import com.formula1.api.domain.driver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
