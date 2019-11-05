package co.micol.command;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.dao.BoardDao;
import co.micol.dto.BoardDto;

public class BoardWriterOk implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		dto.setName(request.getParameter("name"));
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("contents"));
		dto.setwDate(Date.valueOf(request.getParameter("date"))); //String 타입을 Date 타입으로 변환

		int n = dao.insert(dto); //n이 0이면 저장 실패 1이면 저장 성공
		String path = null;
		if(n != 0) {
			 path="boardList.do"; //저장 성공했을 때 글 목록으로
			 response.sendRedirect(path); //url이 boardList.do로 돌아오게
		}else {
			 path="view/boardInsertFail.jsp"; //저장 실패했을 때 뜨는 에러 페이지
				RequestDispatcher dispatcher = request.getRequestDispatcher(path);
				dispatcher.forward(request, response);
		}
		
	}

}
