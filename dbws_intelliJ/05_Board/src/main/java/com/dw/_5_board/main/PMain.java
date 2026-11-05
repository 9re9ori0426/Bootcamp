package com.dw._5_board.main;

public class PMain {
    public static void main(String[] args) {
        // 페이징?

        // 규칙
        int 총데이터수 = 11;
        int 한페이지당보여줄개수 = 3;

        // 페이지수
        int 총페이지수 = (int) Math.ceil((double)총데이터수 / 한페이지당보여줄개수);
        System.out.println(총페이지수);

        int 페이지번호 = 2;

        // 1p : 1, 2, 3
        // 2p : 4, 5, 6
        // 3p : 7, 8, 9
        // 4p : 10, 11

        int 시작데이터번호 = (페이지번호 - 1) * 한페이지당보여줄개수 + 1;
                    // 2p : (2-1) * 3 +1

        int 끝데이터번호 = (페이지번호 == 총페이지수) ? 총데이터수 : 시작데이터번호 + 한페이지당보여줄개수 - 1;
                    // 2p : (2==4) ? asdf : 4 + 3 - 1

        int 시작데이터번호2 = 총데이터수 - (한페이지당보여줄개수 * (페이지번호 - 1));

        // 1P : 11, 10, 9
        // 2p : 8, 7, 6
        // 3p : 5, 4, 3
        // 4p : 2, 1

        int 끝데이터번호2 = (페이지번호 == 총페이지수) ? -1 : 시작데이터번호2 - (한페이지당보여줄개수 + 1);
    }

    public void paging(int pageNum) {
        int total = 11;
        int cnt = 3;

        int totalPage = (int) Math.ceil((double) total / cnt);

        int start = total - (cnt * (pageNum - 1));
        int end = (pageNum == totalPage) ? -1 : start - (cnt - 1);
    }
}
