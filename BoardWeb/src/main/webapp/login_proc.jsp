<%@ page import="com.springbook.biz.user.impl.UserDAO" %>
<%@ page import="com.springbook.biz.user.UserVO" %>
<%@ page contentType="text/html charset=EUC-KR" %>
<%
	//1.사용자 정보
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//2.DB연동처리
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO dao = new UserDAO();
	UserVO user = dao.getUser(vo);
	
	//3.
	if(user != null){
		response.sendRedirect("getBoardList.jsp");
	}
	else{
		response.sendRedirect("login.jsp");
	}
%>