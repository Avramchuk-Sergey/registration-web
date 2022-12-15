package by.it.avramchuk.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import by.it.avramchuk.bean.User;
import by.it.avramchuk.bean.UserList;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String password = request.getParameter("password");
		User user = UserList.getUsers().get(password);
		
		request.setAttribute("user", user);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		User user = new User();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setLogin(login);
		user.setPassword(password);
		
		UserList.addUser(user);
		
		request.setAttribute("user", user);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
		requestDispatcher.forward(request, response);
	}

}
