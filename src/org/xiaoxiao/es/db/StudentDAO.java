package org.xiaoxiao.es.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.xiaoxiao.es.model.Student;

/**
 * 学生表的数据库操作
 * 
 * @author 刘美彤
 * @version 1.0
 * 
 */
public class StudentDAO {
	/**
	 * 根据学号和密码查找学生
	 * 
	 * @param studentNo
	 *            学号
	 * @param password
	 *            密码
	 * @return Studen
	 */
	public static Student findStudent(String studentNo, String password) {
		Student student = null;
		try {
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			ResultSet rs = stat
					.executeQuery("SELECT * FROM STUDENT WHERE student_no=\""
							+ studentNo + "\" AND password=\"" + password
							+ "\"");
			while (rs.next()) {
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
