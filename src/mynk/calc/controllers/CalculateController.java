package mynk.calc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mynk.calc.Calculator;

/**
 * Servlet implementation class CalculateController
 */
@WebServlet("/calculate")
public class CalculateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateController() {
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
		double result = 0.0;
		request.setAttribute("error", "");
		try{
			String action = request.getParameter("command");
			double num1 = Double.parseDouble(request.getParameter("num1"));
			double num2 = Double.parseDouble(request.getParameter("num2"));
			
			try{
				switch(action){
					case "+" :
						result = Calculator.add(num1, num2);
						break;
					case "-" :
						result = Calculator.subtract(num1, num2);
						break;
					case "/" :
						result = Calculator.divide(num1, num2);
						break;
					case "*" :
						result = Calculator.multiply(num1, num2);
						break;
					default:
						result = 0.0;
				}
			}
			catch(Exception ex){
				result = 0.0;
				request.setAttribute("error", "you are trying to divide by zero");
			}
		}
		catch(NumberFormatException ex){
			request.setAttribute("error", "please enter a valid number");
			result = 0.0;	
		}
		
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	
}
