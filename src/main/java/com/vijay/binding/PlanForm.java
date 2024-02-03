package com.vijay.binding;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PlanForm {
    private String planCategory;
    private String planName;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
}
