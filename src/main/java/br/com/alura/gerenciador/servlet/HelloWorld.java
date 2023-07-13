package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//oi

@WebServlet(urlPatterns = "/oi")

public class HelloWorld extends HttpServlet{
	
	public HelloWorld() {
		System.out.println("Criando Hello World Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Ola mundo, esse eh o meu primeiro servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet HelloWorld foi chamado");
		
	}

}
