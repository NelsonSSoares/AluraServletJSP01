package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadstrando Nova Empresa");
		PrintWriter out = response.getWriter();
		String nomeEmpresa = request.getParameter("nome");
		out.print("<html><body><h1>EMPRESA"+nomeEmpresa+" CADASTRADA COM SUCESSO</h1></body></html>");
		
	}

}
