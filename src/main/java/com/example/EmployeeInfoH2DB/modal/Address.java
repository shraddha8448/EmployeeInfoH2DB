package com.example.EmployeeInfoH2DB.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Address_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private long addressId;

    private String street;
    private String city;
    private String state;
    private String pinCode;

    @ManyToOne
    @JoinColumn(name = "empId")
    @JsonIgnore
    private Employee employee;
}
