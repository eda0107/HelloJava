package co.micol.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.BoardEdit;
import co.micol.command.BoardList;
import co.micol.command.BoardView;
import co.micol.command.BoardWrite;
import co.micol.command.BoardWriterOk;
import co.micol.command.Command;
import co.micol.command.MainCommand;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Command> list = null;
	
	
    public FrontController() {
        super();
   }

	
	public void init(ServletConfig config) throws ServletException {
		list = new HashMap<String, Command>();
		//스택에 올라와있는 url리스트
		list.put("/index.do", new MainCommand()); //url에서 index.do로 들어오면 MainCommand를 실행
		list.put("/boardList.do", new BoardList()); //목록 보기 모든 view는 controller를 거쳐야하기 때문에 jsp 파일을 만들고 난 뒤에 controller에 list.put으로 넣어줘야함
		list.put("/boardEdit.do", new BoardEdit()); //글 수정
		list.put("/boardWrite.do", new BoardWrite()); //글쓰기
		list.put("/boardWriterOk.do", new BoardWriterOk()); //글 저장
		list.put("/boardView.do", new BoardView());//글 세부사항 보기
		list.put("/boardWriterOk", new BoardWriterOk());
		list.put("/boardWriterOk", new BoardWriterOk());
		list.put("/boardWriterOk", new BoardWriterOk());
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String url = request.getRequestURI();
	String context = request.getContextPath();
	String path = url.substring(context.length());
	Command subcommand = list.get(path);
	subcommand.excute(request, response);
	
	}

}
