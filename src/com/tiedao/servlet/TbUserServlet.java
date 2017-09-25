package com.tiedao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.mail.Session;
import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tiedao.dao.TbUserDao;
import com.tiedao.pojo.Hobbies;
import com.tiedao.pojo.TbUser;
import com.tiedao.pojo.Tbgrade;

public class TbUserServlet extends HttpServlet {
	TbUserDao dao = new TbUserDao();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		if ("login".equals(method)) {
			login(request, response);
		}
		if ("quit".equals(method)) {
			quit(request, response);
		}
		if ("showPerson".equals(method)) {
			showPerson(request, response);
		}
		if ("showPersonone".equals(method)) {
			showPersonone(request, response);
		}
		if ("showPersontwo".equals(method)) {
			showPersontwo(request, response);
		}
		if ("findAll".equals(method)) {
			findAll(request, response);
		}
		if ("findAllstudent".equals(method)) {
			findAllstudent(request, response);
		}
		if ("chaAllstudent".equals(method)) {
			chaAllstudent(request, response);
		}
		if ("findAllgrade".equals(method)) {
			findAllgrade(request, response);
		}
		if ("chaAllgrade".equals(method)) {
			chaAllgrade(request, response);
		}
		if ("findPower".equals(method)) {
			findPower(request, response);
		}
		if ("update".equals(method)) {
			update(request, response);
		}
		
		if ("updateperson".equals(method)) {
			updateperson(request, response);
		}
		if ("person".equals(method)) {
			person(request, response);
		}
		if ("personone".equals(method)) {
			personone(request, response);
		}
		if ("persontwo".equals(method)) {
			persontwo(request, response);
		}
		if ("upgrade".equals(method)) {
			upgrade(request, response);
		}
		if ("upPower".equals(method)) {
			upPower(request, response);
		}
		if ("delete".equals(method)) {
			delete(request, response);
		}
		if ("deletegrade".equals(method)) {
			deletegrade(request, response);
		}
		if ("save".equals(method)) {
			save(request, response);
		}
		if ("savegrade".equals(method)) {
			savegrade(request, response);
		}
		if ("toUpdate".equals(method)) {
			toUpdate(request, response);
			
		}
		if ("toPower".equals(method)) {
			toPower(request, response);
			
		}
		if ("toGrade".equals(method)) {
			toGrade(request, response);	
		}
		if ("information".equals(method)) {
			information(request, response);
		}
		if ("register".equals(method)) {
			register(request, response);
		}
	}

	public void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(id, uname, pass, sex, education, hobbies, demo);

		boolean flag = dao.update(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=findAll")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher(
					"tbUserServlet?method=toUpdate&id=" + id).forward(request,
					response);
		}
	}
	
	public void updateperson(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(id, uname, pass, sex, education, hobbies, demo);

		boolean flag = dao.update(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=person")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher(
					"tbUserServlet?method=toUpdate&id=" + id).forward(request,
					response);
		}
	}
	
	public void upgrade(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		int rid = 0;
		String 	rname="学生";
		String studentididStr = request.getParameter("studentid");
		int studentid = 0;
		if (studentididStr != null && !"".equals(studentididStr)) {
			studentid = Integer.parseInt(studentididStr);
		}
		String name = request.getParameter("name");
		
		String englishidStr = request.getParameter("english");
		int english = 0;
		if (englishidStr != null && !"".equals(englishidStr)) {
			english = Integer.parseInt(englishidStr);
		}
		
		String mathidStr = request.getParameter("math");
		int math = 0;
		if (mathidStr != null && !"".equals(mathidStr)) {
			math = Integer.parseInt(mathidStr);
		}
		
		String chineseidStr = request.getParameter("chinese");
		int chinese = 0;
		if (chineseidStr != null && !"".equals(chineseidStr)) {
			chinese = Integer.parseInt(chineseidStr);
		}
		Tbgrade grade = new Tbgrade(id, rid, studentid, name, rname, english, math,chinese);

		boolean flag = dao.updategrade(grade);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=findAllgrade")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher(
					"tbUserServlet?method=toGrade&id=" + id).forward(request,
					response);
		}
	}
	
	public void upPower(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		String roleidStr = request.getParameter("roleid");
		int roleid = 0;
		if (roleidStr != null && !"".equals(roleidStr)) {
			roleid = Integer.parseInt(roleidStr);
		}
		

		TbUser user = new TbUser(id,roleid);

		boolean flag = dao.power(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=findPower")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher(
					"tbUserServlet?method=toPower&id=" + id).forward(request,
					response);
		}
	}

	public void toUpdate(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		TbUser user = new TbUser();
		user.setId(id);

		TbUser result = dao.selectById(user);

		// 处理爱好
		List<Hobbies> hobbiesList = new ArrayList<Hobbies>();
		Hobbies hobbies = new Hobbies("敲代码", false);
		Hobbies hobbies2 = new Hobbies("打麻将", false);
		Hobbies hobbies3 = new Hobbies("钓鱼", false);
		Hobbies hobbies4 = new Hobbies("打球", false);

		hobbiesList.add(hobbies);
		hobbiesList.add(hobbies2);
		hobbiesList.add(hobbies3);
		hobbiesList.add(hobbies4);

		List<Hobbies> newList = new ArrayList<Hobbies>();

		// 从数据库中查询出来的爱好
		// 敲代码;打麻将;
		String hobbiesStr = result.getHobbies();
		// [敲代码,打麻将,]
		String[] hobbiesArray = hobbiesStr.split(";");
		// 字符串数组转换成列表
		List<String> list = Arrays.asList(hobbiesArray);

		// for(int i = 0;i<hobbiesArray.length-1;i++){
		// String temp = hobbiesArray[i];
		// Hobbies tempObj = new Hobbies(temp,false);
		//
		// if(hobbiesList.contains(tempObj)){
		// tempObj.setFlag(true);
		// }
		//
		// // for(Hobbies h: hobbiesList){
		// // if(temp.equals(h.getName())){
		// // h.setFlag(true);
		// // }
		// // newList.add(h);
		// // }
		// }

		for (Hobbies h : hobbiesList) {
			if (list.contains(h.getName())) {
				newList.add(new Hobbies(h.getName(), true));
			} else {
				newList.add(new Hobbies(h.getName(), false));
			}
		}

		result.setHobbiesList(newList);

		request.setAttribute("user", result);

		// 跳转
		request.getRequestDispatcher("afterlogin/user/updateUser.jsp").forward(request,
				response);
	}
	
	public void toPower(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		TbUser user = new TbUser();
		user.setId(id);

		TbUser result = dao.selectById(user);
		request.setAttribute("user", result);

		// 跳转
		request.getRequestDispatcher("afterlogin/user/updatePower.jsp").forward(request,
				response);
	}
	
	public void toGrade(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		Tbgrade grade = new Tbgrade();
		grade.setId(id);

		Tbgrade result = dao.selectgradeById(grade);
		request.setAttribute("grade", result);
System.out.println(result);
		// 跳转
		request.getRequestDispatcher("afterlogin/user/updateGrade.jsp").forward(request,
				response);
	}

	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		TbUser user = new TbUser();
		user.setId(id);
		boolean flag = dao.delete(user);

		if (flag) {
			request.setAttribute("info", "恭喜您，删除成功");
		} else {
			request.setAttribute("info", "对不起，删除失败");
		}
		// 跳转
		request.getRequestDispatcher("tbUserServlet?method=findAll").forward(
				request, response);
	}
	
	public void deletegrade(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		Tbgrade grade = new Tbgrade();
		grade.setId(id);
		boolean flag = dao.deletegrade(grade);

		if (flag) {
			request.setAttribute("info", "恭喜您，删除成功");
		} else {
			request.setAttribute("info", "对不起，删除失败");
		}
		// 跳转
		request.getRequestDispatcher("tbUserServlet?method=findAllgrade").forward(
				request, response);
	}

	public void save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(uname, pass, sex, education, hobbies, demo);

		boolean flag = dao.save(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，保存成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=findAll")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，保存失败");
			request.getRequestDispatcher("afterlogin/user/addUser.jsp").forward(request,
					response);
		}
	}
	
	public void savegrade(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		int rid = 0;
		String 	rname="学生";
		String studentididStr = request.getParameter("studentid");
		int studentid = 0;
		if (studentididStr != null && !"".equals(studentididStr)) {
			studentid = Integer.parseInt(studentididStr);
		}
		String name = request.getParameter("name");
		
		String englishidStr = request.getParameter("english");
		int english = 0;
		if (englishidStr != null && !"".equals(englishidStr)) {
			english = Integer.parseInt(englishidStr);
		}
		
		String mathidStr = request.getParameter("math");
		int math = 0;
		if (mathidStr != null && !"".equals(mathidStr)) {
			math = Integer.parseInt(mathidStr);
		}
		
		String chineseidStr = request.getParameter("chinese");
		int chinese = 0;
		if (chineseidStr != null && !"".equals(chineseidStr)) {
			chinese = Integer.parseInt(chineseidStr);
		}
		Tbgrade grade = new Tbgrade(id, rid, studentid, name, rname, english, math,chinese);

		boolean flag = dao.savegrade(grade);
		System.out.println(flag);
		if (flag) {
			request.setAttribute("info", "恭喜您，添加成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=findAllgrade")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，添加失败，ID不存在或用户名不存在！");
			request.getRequestDispatcher("afterlogin/user/addgrade.jsp").forward(request,
					response);
		}
	}
	
	public void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int roleid = 0;
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(uname, pass, sex, education, hobbies, demo,roleid);
        TbUser Result=dao.selectByuname(user);
        if (Result== null) {
		boolean flag = dao.save(user);
		if (flag) {
			System.out.println(flag);
			
			// 跳转
			request.getRequestDispatcher("registersuccess.jsp")
					.forward(request, response);
		} else {
			
			request.getRequestDispatcher("registerfail.jsp").forward(request,
					response);
		}
        }else 
        	
		request.getRequestDispatcher("registerfail.jsp").forward(request,
				response);
	}

	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1、获取前台界面传递过来的值
		String uname = request.getParameter("username");

		// 解决乱码：重新编码 ISO-8859-1 , utf-8
		// byte[] bytes = uname.getBytes("ISO-8859-1");
		// uname = new String(bytes,"UTF-8");

		// 注意：username必须是login.jsp界面中组件的name属性值
		String password = request.getParameter("password");

		// 2、封装成对象
		TbUser user = new TbUser();
		user.setUname(uname);
		user.setPass(password);

		// 3、调用Dao层的方法

		TbUser result = dao.login(user);

		// 4、根据结果进行跳转
		if (result != null) {
			// 将查询出来的信息保存在请求作用域中
			request.setAttribute("user", result);
			// 将登陆的用户信息保存在session
			// 获取session
			HttpSession session = request.getSession();
			session.setAttribute("user", result);
			System.out.println(result);
			// 登录成功(请求转发)
			int roleid= result.getRoleid();
			if (roleid==0) {
				request.getRequestDispatcher("afterlogin/mainstudent.jsp").forward(
						request, response);
			}else if (roleid==1) {
				request.getRequestDispatcher("afterlogin/mainteacher.jsp").forward(
						request, response);
			}else if (roleid==2) {
				request.getRequestDispatcher("afterlogin/main.jsp").forward(
						request, response);
			}
			
		} else {
			// 登录失败(重定向)
			response.sendRedirect("login.jsp");
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
		TbUserDao dao = new TbUserDao();
		List<TbUser> result = dao.findAll();
		request.setAttribute("userList", result);
		
		request.getRequestDispatcher("afterlogin/user/users.jsp").forward(request, response);
	}
	
	public void findAllstudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbUserDao dao = new TbUserDao();
		List<TbUser> result = dao.findAllstudent();
		request.setAttribute("userList", result);
	
		request.getRequestDispatcher("afterlogin/user/users.jsp").forward(request, response);
	}
	
	public void chaAllstudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbUserDao dao = new TbUserDao();
		List<TbUser> result = dao.findAllstudent();
		request.setAttribute("userList", result);
	
		request.getRequestDispatcher("afterlogin/user/chastudents.jsp").forward(request, response);
	}
	
	public void findAllgrade(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbUserDao dao = new TbUserDao();
		List<Tbgrade> result = dao.findAllgrade();
		request.setAttribute("gradeList", result);
	
		request.getRequestDispatcher("afterlogin/user/grades.jsp").forward(request, response);
	}
	
	public void chaAllgrade(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbUserDao dao = new TbUserDao();
		List<Tbgrade> result = dao.findAllgrade();
		request.setAttribute("gradeList", result);
	System.out.println(result);
		request.getRequestDispatcher("afterlogin/user/chagrades.jsp").forward(request, response);
	}
	
	public void findPower(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TbUserDao dao = new TbUserDao();
		List<TbUser> result = dao.findAll();
		request.setAttribute("userList", result);
  
	System.out.println(result);
		request.getRequestDispatcher("afterlogin/user/power.jsp").forward(request, response);
	}
	
	private void showPerson(HttpServletRequest request,   
            HttpServletResponse response) throws ServletException, IOException{  
        //找到保存到session中的登录用户  
        TbUser user =  (TbUser) request.getSession().getAttribute("user");  
        //通过用户id重新查找用户  
        TbUser result = dao.selectById(user);
     // 处理爱好
     		List<Hobbies> hobbiesList = new ArrayList<Hobbies>();
     		Hobbies hobbies = new Hobbies("敲代码", false);
     		Hobbies hobbies2 = new Hobbies("打麻将", false);
     		Hobbies hobbies3 = new Hobbies("钓鱼", false);
     		Hobbies hobbies4 = new Hobbies("打球", false);

     		hobbiesList.add(hobbies);
     		hobbiesList.add(hobbies2);
     		hobbiesList.add(hobbies3);
     		hobbiesList.add(hobbies4);

     		List<Hobbies> newList = new ArrayList<Hobbies>();

     		// 从数据库中查询出来的爱好
     		// 敲代码;打麻将;
     		String hobbiesStr = result.getHobbies();
     		// [敲代码,打麻将,]
     		String[] hobbiesArray = hobbiesStr.split(";");
     		// 字符串数组转换成列表
     		List<String> list = Arrays.asList(hobbiesArray);
     		for (Hobbies h : hobbiesList) {
     			if (list.contains(h.getName())) {
     				newList.add(new Hobbies(h.getName(), true));
     			} else {
     				newList.add(new Hobbies(h.getName(), false));
     			}
     		}

     		result.setHobbiesList(newList);
        request.setAttribute("user", result);
     // 跳转
     		request.getRequestDispatcher("afterlogin/user/updatePerson.jsp").forward(request,
     				response);
    }  
	
	private void showPersonone(HttpServletRequest request,   
            HttpServletResponse response) throws ServletException, IOException{  
        //找到保存到session中的登录用户  
        TbUser user =  (TbUser) request.getSession().getAttribute("user");  
        //通过用户id重新查找用户  
        TbUser result = dao.selectById(user);
     // 处理爱好
     		List<Hobbies> hobbiesList = new ArrayList<Hobbies>();
     		Hobbies hobbies = new Hobbies("敲代码", false);
     		Hobbies hobbies2 = new Hobbies("打麻将", false);
     		Hobbies hobbies3 = new Hobbies("钓鱼", false);
     		Hobbies hobbies4 = new Hobbies("打球", false);

     		hobbiesList.add(hobbies);
     		hobbiesList.add(hobbies2);
     		hobbiesList.add(hobbies3);
     		hobbiesList.add(hobbies4);

     		List<Hobbies> newList = new ArrayList<Hobbies>();

     		// 从数据库中查询出来的爱好
     		// 敲代码;打麻将;
     		String hobbiesStr = result.getHobbies();
     		// [敲代码,打麻将,]
     		String[] hobbiesArray = hobbiesStr.split(";");
     		// 字符串数组转换成列表
     		List<String> list = Arrays.asList(hobbiesArray);
     		for (Hobbies h : hobbiesList) {
     			if (list.contains(h.getName())) {
     				newList.add(new Hobbies(h.getName(), true));
     			} else {
     				newList.add(new Hobbies(h.getName(), false));
     			}
     		}

     		result.setHobbiesList(newList);
        request.setAttribute("user", result);
     // 跳转
     		request.getRequestDispatcher("afterlogin/user/updatePerson1.jsp").forward(request,
     				response);
    }  
	
	private void showPersontwo(HttpServletRequest request,   
            HttpServletResponse response) throws ServletException, IOException{  
        //找到保存到session中的登录用户  
        TbUser user =  (TbUser) request.getSession().getAttribute("user");  
        //通过用户id重新查找用户  
        TbUser result = dao.selectById(user);
     // 处理爱好
     		List<Hobbies> hobbiesList = new ArrayList<Hobbies>();
     		Hobbies hobbies = new Hobbies("敲代码", false);
     		Hobbies hobbies2 = new Hobbies("打麻将", false);
     		Hobbies hobbies3 = new Hobbies("钓鱼", false);
     		Hobbies hobbies4 = new Hobbies("打球", false);

     		hobbiesList.add(hobbies);
     		hobbiesList.add(hobbies2);
     		hobbiesList.add(hobbies3);
     		hobbiesList.add(hobbies4);

     		List<Hobbies> newList = new ArrayList<Hobbies>();

     		// 从数据库中查询出来的爱好
     		// 敲代码;打麻将;
     		String hobbiesStr = result.getHobbies();
     		// [敲代码,打麻将,]
     		String[] hobbiesArray = hobbiesStr.split(";");
     		// 字符串数组转换成列表
     		List<String> list = Arrays.asList(hobbiesArray);
     		for (Hobbies h : hobbiesList) {
     			if (list.contains(h.getName())) {
     				newList.add(new Hobbies(h.getName(), true));
     			} else {
     				newList.add(new Hobbies(h.getName(), false));
     			}
     		}

     		result.setHobbiesList(newList);
        request.setAttribute("user", result);
     // 跳转
     		request.getRequestDispatcher("afterlogin/user/updatePerson2.jsp").forward(request,
     				response);
    }  
	
	public void person(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(id, uname, pass, sex, education, hobbies, demo);

		boolean flag = dao.update(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=information")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher("afterlogin/user/updatePerson.jsp").forward(request,
					response);
               }
      }
	
	public void personone(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		int roleid=1;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(id, uname, pass, sex, education, hobbies, demo,roleid);

		boolean flag = dao.update(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=information")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher("afterlogin/user/updatePerson.jsp").forward(request,
					response);
               }
      }
	
	public void persontwo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = 0;
		int roleid=2;
		if (idStr != null && !"".equals(idStr)) {
			id = Integer.parseInt(idStr);
		}
		
		String uname = request.getParameter("uname");
		String sex = request.getParameter("sex");
		String pass = request.getParameter("pass");
		String education = request.getParameter("education");
		// 爱好
		String hobbies = "";
		String[] hobbiesArray = request.getParameterValues("hobbies");
		if (hobbiesArray != null && !"".equals(hobbiesArray)) {
			for (String str : hobbiesArray) {
				hobbies += str + ";";
			}
		}
		String demo = request.getParameter("demo");

		TbUser user = new TbUser(id, uname, pass, sex, education, hobbies, demo,roleid);

		boolean flag = dao.update(user);
		if (flag) {
			request.setAttribute("info", "恭喜您，修改成功");
			// 跳转
			request.getRequestDispatcher("tbUserServlet?method=information")
					.forward(request, response);
		} else {
			request.setAttribute("info", "对不起，修改失败");
			request.getRequestDispatcher("afterlogin/user/updatePerson.jsp").forward(request,
					response);
               }
      }
	
	public void information(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//找到保存到session中的登录用户  
        TbUser user =  (TbUser) request.getSession().getAttribute("user");  
        //通过用户id重新查找用户  
        TbUser result = dao.selectById(user);
        request.setAttribute("user", result);

		// 跳转
		request.getRequestDispatcher("afterlogin/user/information.jsp").forward(request,
				response);
	}
	
	public void quit(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("login.jsp").forward(request,
				response);
	}
	
}
