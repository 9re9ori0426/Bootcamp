package com.bo._2_attr;

import lombok.*;

@Data
@AllArgsConstructor
public class Result {
    private int price;
    private int money;
    private int exchange;
    private String message;

    public String getExchangeMessage() {
        if( exchange > 0 ){
            return String.format("잔돈 : %d", exchange);
        }
        return "";
    }

    public boolean isNotEnough() {
        return exchange < 0;
    }

    @Deprecated
    public String test() {
            return "<button onclick=\"<%=r.test(!b)%>\">얼마 모자른데요??</button>\n" +
                    "            <div><%=r.getExchange()%></div>";
    }
}
