package com.vital.people.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Human {
    private Long id;
    private String name;
    private int age;
}
