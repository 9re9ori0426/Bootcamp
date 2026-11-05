package com.dw._5_board.review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDTO {
    private int no;
    private String title;
    private String txt;
    private Date date;
}
