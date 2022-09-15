package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/GuGu")
//@WebServlet(urlPatterns = {"/GuGu"})
public class GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GuGu() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println("dan="+dan);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>구구단 %d단</h1>", dan);
		for(int i = 1; i <= 9; i++) {
			out.printf("%d * %d= %d<br>", dan, i, (dan*i));
		}
		out.println("</html></body>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
