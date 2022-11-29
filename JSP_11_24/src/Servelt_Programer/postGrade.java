package Servelt_Programer;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class postGrade
 */
@WebServlet("/postGrade")
public class postGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postGrade() {
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
		int korea = requsetSum(request,"korea");
		int english = requsetSum(request,"english");
		int math = requsetSum(request,"math");
		
		Grade grade = new Grade(korea,english,math);
		response.setContentType("text/html; charset=EUC-KR");
		Writer writer = response.getWriter();
		writer.append("<html><head></head><body></html>");
		writer.append("<p>평균 = >"+grade.sum()+"</p>");
		writer.append("</body></html>");
	}
	public int requsetSum(HttpServletRequest request,String num) {
		return Integer.parseInt(request.getParameter(num));
	}

}
