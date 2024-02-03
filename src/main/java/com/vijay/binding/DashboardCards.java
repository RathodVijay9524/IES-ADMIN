package com.vijay.binding;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DashboardCards {

    private Long plansCnt;
    private Long approvedCnt;
    private Long deniedCnt;
    private Double beniftAmtGiven;
}
