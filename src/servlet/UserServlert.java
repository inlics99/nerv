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
		//�����������ݵı���
		req.setCharacterEncoding("UTF-8");
		//��servlet��ȥ����service
		UserService us=new UserServiceImp();
		User user=new User();
		//���ҳ������
		String name=req.getParameter("name");
		//ǿת��Ҫ��װ��,�����ݽ���ת��
		int age=Integer.parseInt(req.getParameter("age"));
		user.setName("����");
		user.setAge(20);
		us.save(user);
	}

}
