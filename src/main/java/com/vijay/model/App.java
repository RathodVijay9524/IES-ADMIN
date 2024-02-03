package com.vijay.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class App {

    private Long caseNum;

    private String fullname;

    private String email;

    private String phno;

    private String gender;

    private LocalDate dob;

    private Long ssn;

    private Integer userId;
}
