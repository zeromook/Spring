<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//1. �������� ����� ���� ��ü�� ���������Ѵ�.
	session.invalidate();

	//2. ���� ������, ���� ȭ������ �̵��Ѵ�.
	response.sendRedirect("login.jsp");
%>