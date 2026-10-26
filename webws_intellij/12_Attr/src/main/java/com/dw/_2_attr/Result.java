package com.dw._2_attr;

import lombok.*;

// Java Bean
// VO(Value Object), DTO(Data Transfer Object), POJO(Plain Old Java Object)

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Result {
//  필드, 속성, 멤버변수, 인스턴스변수

    // 결과에서 뭐쓸지?
    private int price;
    private int money;
    private int exchange;
    private String say;
}
