package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Incident {
    UUID id;
    LocalDate date;
    String description;
    TypeIncident typeIncident;
}
