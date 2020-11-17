package src.srccode.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendResponse("doGet", request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendResponse("doPost", request, response);
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendResponse("doPut", request, response);
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendResponse("doDelete", request, response);
	}
	
	public void sendResponse(String string, HttpServletRequest request, HttpServletResponse response) throws IOException {	
		response.setContentType("text/html");
		
		try(PrintWriter writer = response.getWriter()) {
			writer.println(string);
		}
	}
}

