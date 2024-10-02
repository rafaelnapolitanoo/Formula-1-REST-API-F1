package com.formula1.api.dto;

import java.time.LocalDate;

public record DriverDTO(String name, int driverNumber, int teamId, String nationality, LocalDate dateOfBirth, int wins, int podiums, int championships) {
}
