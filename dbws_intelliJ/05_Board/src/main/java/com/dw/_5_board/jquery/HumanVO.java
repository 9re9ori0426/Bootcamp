package com.dw._5_board.jquery;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HumanVO {
    private int no;
    private String name;
    private int age;

    public String toJSON() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
