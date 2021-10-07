package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.common.JDBCUtil;
import com.springbook.biz.user.UserVO;

@Repository("userDAO")
public class UserDAO {

	//jdbc ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	//sql
	private static final String USER_GET = 
					"select * from users where id=? and password=?";
	
	
	//crud���
	public UserVO getUser(UserVO vo){
		UserVO user = null;
		try{
			System.out.println("===>JDBC�� getUser() ���ó��");
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()){
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.close(stmt, conn);
		}
		return user;
	}
}
