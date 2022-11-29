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
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String major = request.getParameter("major");
		String http = request.getParameter("http");
		String[] hobbys = request.getParameterValues("hobby");
		
		response.setContentType("UTF-8");
		Writer writer = response.getWriter();
		writer.append("<html><head></head><body>");
		writer.append("<p>ID = "+id+"<p>");
		writer.append("<p>name = "+name+"<p>");
		writer.append("<p>pw = "+pw+"<p>");
		writer.append("<p>major = "+major+"<p>");
		for(int i=0;i<hobbys.length;i++) {
			writer.append("<p>hobbys = "+hobbys[i]+"<p>");
		}
		writer.append("<p>http = "+http+"<p>");
		writer.append("</body></html>");
		
		
		
		
		
	}

}
