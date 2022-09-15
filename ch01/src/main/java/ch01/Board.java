package ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		// 날짜 포맷팅
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String nowDate = sdf.format(new java.util.Date());
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.println("<p>제목 : " + title);
		out.println("<p>작성자 : " + writer);
		out.println("<p>작성일 : " + nowDate);
		out.println("<p>내용  </p><pre>" + content + "</pre>");
		out.println("</html></body>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
 * 게시판 제목 : 안시성 작성자 : 양만춘
 * 
 * 작성일 : Thu Sep 01 16:50:17 KST 2022
 * 
 * 내용
 * 
 * 당태종 체포작전
 */