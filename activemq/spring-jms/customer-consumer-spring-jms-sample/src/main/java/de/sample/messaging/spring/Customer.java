package de.sample.messaging.spring;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer {

    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;

}
