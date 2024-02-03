package com.vijay.entities;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "IES_APPS")
public class AppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caseNum;

    private String fullname;

    private String email;

    private String gender;

    private LocalDate dob;

    private Long phno;

    private Long ssn;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
