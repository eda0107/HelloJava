package co.micol.controller;

import java.io.IOException;

import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.IndexCommand;
import co.micol.command.member.LogoutCommand;
import co.micol.command.member.MemberInputCommand;
import co.micol.command.member.MemberInsertOkCommand;
import co.micol.command.member.MemberListCommand;
import co.micol.command.notice.NoticeListCommand;
import co.micol.command.member.IdCheckCommand;
import co.micol.command.member.LoginCommand;
import co.micol.command.member.LoginOkCommand;
import co.micol.common.Command;

@WebServlet(description = "메인컨트롤러", urlPatterns = { "/NewFrontController" })
public class NewFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Command> cont = new HashMap<String, Command>();

	public NewFrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		cont.put("/index.do", new IndexCommand()); // index.do로 들어오면 뒤에 클래스 실행시켜라
		cont.put("/login.do", new LoginCommand());
		cont.put("/loginOk.do", new LoginOkCommand());
		cont.put("/logout.do", new LogoutCommand());
		cont.put("/memberInput.do", new MemberInputCommand());
		cont.put("/idCheck.do", new IdCheckCommand());
		cont.put("/memberInsertOk.do", new MemberInsertOkCommand());
		cont.put("/memberList.do", new MemberListCommand());
		cont.put("/noticeList.do", new NoticeListCommand());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length()); // uri에서 context만큼 잘라내고 다음꺼 실행

		Command commandImpl = cont.get(path); // 실행클래스 선택
		commandImpl.excute(request, response);

	}

}
