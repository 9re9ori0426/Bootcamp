package com.bo._8_el;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private double mid;
    private double fin;
    private double avg;
    private String grade;
}
