package com.dw._3_sc;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Model {

    /*
        parameter - V에서 만든 값(html, jsp, get요청시 만든 문자열, form -> input name)
                  - String, String[] _chkbox
                  - req에 실려서 전송

                - 값 읽을 떄
                  - java : req.getParameter("이름")
                  - EL : ${param.이름}

        attribute - Java (Model, Controller)
                  - Object      req.setA("a", stss)
                  - req에 실려서 전송

                - 값 읽을 떄
                  - java : req.getAttribute("이름");
                  - EL : ${이름}
     */

    public static void printSC(HttpServletRequest request) {
        /*
            session.attr - java(M, C) - 서버랑 ~~~~~~~~ 클라이언트 연결 상태에 담김
                - object
                - 시간제한 (기본 30분)

                - 값 읽을 때
                    EL : ${이름} / ${sessionScope.이름}
                    Java :
         */
        System.out.println(request.getSession().getAttribute("c"));

        /*
            cookie - java에서 만든 값

                - 값 읽을 때
                    EL : ${cookie.쿠키이름.value}
                    Java :
         */
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());
            if(cookie.getName().equals("d")){
                System.out.println(cookie.getValue());
            }
        }
    }

    public static void make(HttpServletRequest request, HttpServletResponse response) {
        String bbb = "zzz";
        request.setAttribute("b", bbb);

        request.getParameter("a");

        // arrt, param
        // third 에선 못 씀

        // session, cookie
        String ccc = "세션~~~!!!";
        HttpSession hs = request.getSession();
        hs.setMaxInactiveInterval(10);  // 10초

        // 서버와 클라이언트 연결상태 (접속한거)
        // 연결만 살아있으면 사이트 어디에서든 사용 가능

        // 연결이 끊어지면 못 씀 (접속 종료 / 브라우저 다 닫은거)
        // 세션 유지시간 (기본 30분)

        // 유지시간 이내에 '요청' 등의 일이 일어나지 않으면 죽음.
        // 시간내에 '요청'등 작업을 하면 갱신됨 (유지시간 초기화)


        // cookie

        // 사용자 컴퓨터에 파일로 저장.
        // 브라우저를 꺼도, 접속을 끊어도, 재부팅을 해도 살아있음.

        // 시간제한 걸 수 있음.
        String ddd = "쿠키~~~";
        Cookie cookie = new Cookie("d", ddd);
        cookie.setMaxAge( 5 * 60);  // 5분

        response.addCookie(cookie);
    }
}
