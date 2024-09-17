package com.hospitalApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "last_name", length = 64)
    private String lastName;

    @Column(name = "first_name", length = 64)
    private String firstName;

    @Column(name = "position", length = 64)
    private String position;

    @Column(name = "salary")
    private double salary;

    public Employee(String lastName, String firstName, String position, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salary = salary;
    }
}
