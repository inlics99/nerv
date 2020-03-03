package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import severice.UserService;
import severice.impl.UserServiceImp;
@WebServlet("/Add")
public class UserServlert extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method 
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置请求数据的编码
		req.setCharacterEncoding("UTF-8");
		//在servlet中去访问service
		UserService us=new UserServiceImp();
		User user=new User();
		//获得页面数据
		String name=req.getParameter("name");
		//强转需要包装类,对数据进行转换
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName("张三");
		user.setAge(20);
		us.save(user);
	}

}
