package com.tiedao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tiedao.dao.TbModuleDao;
import com.tiedao.pojo.Hobbies;
import com.tiedao.pojo.TbModule;

public class TbModuleServlet extends HttpServlet {
	TbModuleDao dao = new TbModuleDao();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		if ("findAll".equals(method)) {
			findAll(request, response);
		}
		if ("update".equals(method)) {
			update(request, response);
		}
		if ("delete".equals(method)) {
			delete(request, response);
		}
		if ("save".equals(method)) {
			save(request, response);
		}
		if ("toUpdate".equals(method)) {
			toUpdate(request, response);
		}
	}

	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		String mname = request.getParameter("mname");
		String upidStr = request.getParameter("upid");
		int upid = 0;
		if (upidStr != null && !"".equals(upidStr)) {
			upid = Integer.parseInt(upidStr);
		}
		String url = request.getParameter("url");
		String demo = request.getParameter("demo");

		TbModule module = new TbModule(id, mname, upid, url, demo);

		boolean flag = dao.update(module);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbModuleServlet?method=findAll")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher(
					"tbModuleServlet?method=toUpdate&id=" + id).forward(
					request, response);
		}
	}

	public void toUpdate(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		TbModule module = new TbModule();
		module.setId(id);

		TbModule result = dao.selectById(module);

		request.setAttribute("module", result);
		// 跳转
		request.getRequestDispatcher("afterlogin/module/updateModule.jsp")
				.forward(request, response);
	}

	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		TbModule module = new TbModule();
		module.setId(id);
		boolean flag = dao.delete(module);

		if (flag) {
			request.setAttribute("info", "恭喜您，删除成功");
		} else {
			request.setAttribute("info", "对不起，删除失败");
		}
		// 跳转
		request.getRequestDispatcher("tbModuleServlet?method=findAll").forward(
				request, response);
	}

	public void save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		String mname = request.getParameter("mname");
		String upidStr = request.getParameter("upid");
		int upid = 0;
		if (upidStr != null && !"".equals(upidStr)) {
			upid = Integer.parseInt(upidStr);
		}
		String url = request.getParameter("url");
		String demo = request.getParameter("demo");

		TbModule module = new TbModule(mname, upid, url, demo);

		boolean flag = dao.save(module);
		if (flag) {
			request.setAttribute("info", "恭喜您，保存成功");
			// 跳转
			request.getRequestDispatcher("tbModuleServlet?method=findAll")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，保存失败");
			request.getRequestDispatcher("afterlogin/module/addModule.jsp")
					.forward(request, response);
		}
	}

	/**
	 * 查询所有
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbModuleDao dao = new TbModuleDao();
		List<TbModule> result = dao.findAll();
		request.setAttribute("moduleList", result);
		request.getRequestDispatcher("afterlogin/module/modules.jsp").forward(
				request, response);
	}

}
