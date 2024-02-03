package com.vijay.binding;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class UnlockAccForm {

    private String email;
    private String tempPwd;
    private String newPwd;
    private String confirmPwd;
}
