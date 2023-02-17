package controller;

import java.io.IOException;
import model.wordGuess;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class wordServlet
 */
@WebServlet("/wordServlet")
public class wordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String guess = request.getParameter("guess");
		wordGuess userGuess = new wordGuess(guess);
		
		request.setAttribute("theGuess", userGuess);
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		
	}

}
