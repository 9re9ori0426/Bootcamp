package com.dw._2_db_web;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDTO {
    // 필드   결과에서 뭐 쓸지? -> tbl
    private int no;
    private String name;
    private int age;
}
