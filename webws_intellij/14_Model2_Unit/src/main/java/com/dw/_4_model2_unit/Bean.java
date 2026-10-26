package com.dw._4_model2_unit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bean {
    // 결과에서 뭐쓸지?
    private String cc;
    private double num;
    private String unit;
    private double result;
    private String convertedUnit;
}
