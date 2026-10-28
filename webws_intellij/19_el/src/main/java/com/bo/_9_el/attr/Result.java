package com.bo._9_el.attr;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private int price;
    private int money;
    private int exchange;
    private String message;
}
