package com.bridgelabz.greetingapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "Greeting_Table")

public class Greeting {
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    private final String message;

    public  Greeting() {
        id = 0;
        message = "";

    }
}
