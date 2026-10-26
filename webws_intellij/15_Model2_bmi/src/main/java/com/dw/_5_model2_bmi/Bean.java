package com.dw._5_model2_bmi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bean {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String result;
}
