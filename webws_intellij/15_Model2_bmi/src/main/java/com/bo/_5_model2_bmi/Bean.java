package com.bo._5_model2_bmi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bean {
    private String name;
    private double height;
    private double weight;
    private String bmi_msg;
    private String result_msg;

}
