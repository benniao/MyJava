package org.xiaoxiao.es.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCourseDAO {
	public static boolean hasSelected(int studentId, int courseId) {
		try {
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			String sql = "SELECT * FROM STUDENT_COURSE WHERE student_id="
					+ studentId + " AND course_id=" + courseId;
			ResultSet rs = stat.executeQuery(sql);
			if (rs.first())
				return true;
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static int add(int studentId, int courseId) {
		try {
			if (hasSelected(studentId, courseId)) {
				return -1;
			}
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			String sql = "INSERT INTO STUDENT_COURSE(student_id,course_id) VALUES (\""
					+ studentId + "\",\"" + courseId + "\")";
			int result = stat.executeUpdate(sql);
			stat.close();
			conn.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int delete(int studentId, int courseId) {
		try {
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			String sql = "DELETE FROM STUDENT_COURSE WHERE student_id="
					+ studentId + " AND course_id=" + courseId;
			int result = stat.executeUpdate(sql);
			stat.close();
			conn.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
