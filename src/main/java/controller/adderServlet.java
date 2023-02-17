package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.adder;

/**
 * Servlet implementation class adderServlet
 */
@WebServlet("/adderServlet")
public class adderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstNum = request.getParameter("firstNum");
		String secNum = request.getParameter("secNum");
		int first = (Integer.parseInt(firstNum));
		int sec = (Integer.parseInt(secNum));
		adder add = new adder(first,sec);
		
		request.setAttribute("userAdd", add);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(add.toString());
		//writer.close();
	}

}
