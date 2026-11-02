package com.dw._5_board.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieVO {
    private int no;
    private String title;
    private String actor;
    private String img;
    private String story;
}
