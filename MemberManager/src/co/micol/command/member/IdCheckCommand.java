package co.micol.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;
import co.micol.dao.MemberDao;

public class IdCheckCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		MemberDao dao = new MemberDao();
		String id = request.getParameter("id");
		boolean b = dao.isIdCheck(id);
		
		String path = "view/idCheckResult.jsp";
		request.setAttribute("idCheck", b);
		request.setAttribute("id", id);
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
