package Servelt_Programer;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formex
 */
@WebServlet("/formex")
public class formex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet.. 호출");
		
		request.setCharacterEncoding("UTF-8");
		
		int korean = requsetSum(request,"korea");
		int english = requsetSum(request,"english");
		int math = requsetSum(request,"math");
		
		Grade2 sum = new Grade2(korean,english,math);
		
		response.setContentType("UTF-8");
		Writer writer = response.getWriter();
		writer.append("<html><head></head><body>");
		writer.append("<p>당신의점수는=> "+sum.result()+"<p>");
		writer.append("</body></html>");
		
		
	}
	public int requsetSum(HttpServletRequest request,String num) {
		return Integer.parseInt(request.getParameter(num));
	}

}
