package com.tiedao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tiedao.dao.TbUserDao;
import com.tiedao.pojo.TbUser;

public class FindAllServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbUserDao dao = new TbUserDao();
		List<TbUser> result = dao.findAll();
		request.setAttribute("userList", result);
		request.getRequestDispatcher("users.jsp").forward(request, response);
	}

}
