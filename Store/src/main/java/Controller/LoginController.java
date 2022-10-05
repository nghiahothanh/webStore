package Controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import BEAN.User;
import DAO.LoginDAO;
import DB.DBConnect;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection=null;
		try {
			connection = DBConnect.getConnection();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String userNameString = request.getParameter("name");
		String passWordString = request.getParameter("password");

        User user=new User();
	
			try {
				user = LoginDAO.Login(connection, userNameString, passWordString);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		if (user != null && user.getCategory()==1) {
		     HttpSession session = request.getSession();
             session.setAttribute("user", user);
			RequestDispatcher rDispatcher = request.getRequestDispatcher("views/dashboard.jsp");
			rDispatcher.forward(request, response);
		}
		 else {
             String message = "Invalid email/password";
             request.setAttribute("message", message);
         }
	}
}
