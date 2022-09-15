package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add3")
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get방식이면 자동으로 인코딩 되고, post 방식일 땐 해줘야함
		request.setCharacterEncoding("utf-8"); 
		// 목표 : 1부터 누적값 전달
		int num = Integer.parseInt(request.getParameter("num"));
		String loc = request.getParameter("loc");
		System.out.println("num="+num);
		System.out.println("loc="+loc);
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum+=i;
		}
		
//		response.setContentType("text/html; charset=utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 합계</h1>", num);
		out.println(sum);
		out.printf("<h1>loc : %s<h1>",loc);
		out.println("</html></body>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
