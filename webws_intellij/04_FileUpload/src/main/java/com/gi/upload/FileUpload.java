package com.gi.upload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 저장 경로(로컬, 실제 서버상 경로)
		String savePath = "C:\\Users\\thrma\\OneDrive\\바탕 화면\\upload";
		String saveRealPath = request.getServletContext().getRealPath("imgFile");
		System.out.println(saveRealPath);
		
		// 서버를 나만 쓰는게 아니라 여러사람이 사용함
		// 로컬 파일 이름은 얼마든지 같거나 중복될 수 있음.
		// 서버 겹치면?
		
		
		// 2. 파일 업로드 처리 끝
		MultipartRequest mr = new  MultipartRequest(request, saveRealPath,
				30*1024*1024, 							// 30mb 파일 최대  허용 용량(넘으면 예외)
				"utf-8",					// req.setCh("utf-8")
				new DefaultFileRenamePolicy()
				);    
		
		//3. 값 받기 (박스포장 했으니 그걸 까야 req(비닐)에 접근 가능)
		
		String n = mr.getParameter("name");
		System.out.println(n);
		
		// 파일명 읽을때
			// 아까 중복 안되게 처리한 것 때문에 올릴때 파일명이 중요한게 아님.
			// 서버상에 올라간 '그' 이름이 중요함
		
		String pic = mr.getFilesystemName("pic");
		String etc = mr.getFilesystemName("etc");
		System.out.println(pic);
		System.out.println(etc);
		
		
		// 브라우저에 쓸 준비
		
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("</head>");
        out.print("<body>");
        
        out.print("<h1>" + n + "</h1>");
        out.printf("<h1><img src='imgFile/%s'></h1>",  pic );
        out.printf("<h1><img src='imgFile/%s'></h1>", etc);
        out.printf("<h1><a href='imgFile/%s'>사진보기</a></h1>",  pic );
        out.printf("<h1><a href='imgFile/%s'>파일 다운로드</a></h1>", etc);
        
        out.print("</body>");
        out.print("</html>");    


		
		
	}

}
