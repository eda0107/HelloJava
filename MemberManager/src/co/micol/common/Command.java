package co.micol.common;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//excute메소드 : request,response을 매개값으로 받고 throw~(발생할 수 있는 exception),interface라 메소드 선언만, 실행문 ㄴㄴ
	public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

	
}
