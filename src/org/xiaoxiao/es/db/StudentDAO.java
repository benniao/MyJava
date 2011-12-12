package org.xiaoxiao.es.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.xiaoxiao.es.model.Student;

public class StudentDAO {
	public static Student findStudent(String studentNo,String password){
		Student student = null;
		try {
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("SELECT * FROM STUDENT WHERE student_no=\""+studentNo+"\" AND password=\""+password+"\"");
			while(rs.next()){
				student = new Student();
				student.setId(rs.getInt("id"));
				student.setPassword(rs.getString("password"));
				student.setName(rs.getString("name"));
				student.setStudentNO("student_no");
			}
			rs.close();
			stat.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
}
