//package co.micol.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.HashMap;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import co.micol.command.IndexCommand;
//import co.micol.common.Command;
//
///**
// * Servlet implementation class FrontController
// */
//@WebServlet(description = "메인컨트롤러", urlPatterns = { "/FrontController" })
//public class FrontController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	HashMap<String, Command> cont = new HashMap<String, Command>();
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public FrontController() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// cont에 url과 실행 class를 정의하는 부분
//		cont.put("/index.do", new IndexCommand()); // index.do로 들어오면 뒤에 클래스 실행시켜라
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
////		cont.put("/index.do", new IndexCommand());
//
//		// 요청하는 url을 분석하여 실행하는 부분
//		request.setCharacterEncoding("utf-8");
//		String uri = request.getRequestURI();
//		String context = request.getContextPath();
//		String path = uri.substring(context.length()); // uri에서 context만큼 잘라내고 다음꺼 실행
//
//		Command commandImpl = cont.get(path); // 실행클래스 선택
//		try {
//			commandImpl.excute(request, response);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}