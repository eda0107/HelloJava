package co.micol.command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.dao.BoardDao;
import co.micol.dto.BoardDto;

public class BoardList implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		list = dao.select();
		
		request.setAttribute("list", list); //list라는 변수를 만들어 ArrayList list의 값을 담겠다(요청 객체에 값을 놓기)
		String path = "view/boardlist.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
		
		
	}

}
