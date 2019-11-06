package co.micol.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.dao.BoardDao;
import co.micol.dto.BoardDto;

public class BoardEditOk implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//update 호출
		
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		dto.setId(Integer.parseInt(request.getParameter("id")));
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("contents"));
		
		int n = dao.update(dto);
		String path;
		if(n == 0) {
			path = "view/boardInsertFall.jsp";
		} else {
			path = "boardView.do";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
