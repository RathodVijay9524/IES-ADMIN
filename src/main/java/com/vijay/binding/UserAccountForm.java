package com.vijay.binding;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Builder
@Data
public class UserAccountForm {
    private String fullName;
    private String email;
    private Long mobileNo;
    private String gender;
    private LocalDate dob;
    private Long ssn;
    private String activeSw;
    private Integer roleId;
}
