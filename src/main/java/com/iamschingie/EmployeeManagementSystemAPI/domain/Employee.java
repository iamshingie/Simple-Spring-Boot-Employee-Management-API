package com.iamschingie.EmployeeManagementSystemAPI.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    @Column(nullable = false, updatable = false)
    private String EmployeeId;

    public Employee(String name,
                    String email,
                    String jobTitle,
                    String phoneNumber,
                    String employeeId) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        EmployeeId = employeeId;
    }
}
