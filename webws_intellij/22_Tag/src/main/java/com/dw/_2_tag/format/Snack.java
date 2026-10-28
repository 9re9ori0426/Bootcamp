package com.dw._2_tag.format;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Snack {
    private String name;
    private int price;
    private Date date;
}
