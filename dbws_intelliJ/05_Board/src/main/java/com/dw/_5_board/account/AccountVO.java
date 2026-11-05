package com.dw._5_board.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountVO {
    // 결과에서 뭐 쓸지? or db tbl
    private String id;
    private String pw;
    private String name;
}
