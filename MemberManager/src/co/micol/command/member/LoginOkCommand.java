package co.micol.command.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.common.Command;
import co.micol.dao.MemberDao;

public class LoginOkCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MemberDao dao = new MemberDao();

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String grant = dao.loginCheck(id, pw);

		if (grant == null) {
			response.sendRedirect("login.do");
		} else {
			HttpSession httpsession = request.getSession(); // 자바 객체를 이용해서 session 객체 이용할 때
			httpsession.setAttribute("id", id);
			httpsession.setAttribute("grant", grant);

			response.sendRedirect("index.do");
		}
	}

}
