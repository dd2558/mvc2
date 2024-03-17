package com.hdw.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public BoardServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		String command = request.getParameter("command");
		System.out.println("BoardServlet에서 요청을 받음" + command);
	
	}
	protected void dePost(HttpServletRequest request, HttpServletResponse response) throws SerialException, IOException{
		
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}
