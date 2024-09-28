package com.formula1.api.repository;

import com.formula1.api.domain.race.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository  extends JpaRepository<Race, Long> {
}
