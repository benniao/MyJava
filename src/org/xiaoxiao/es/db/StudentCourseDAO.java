package org.xiaoxiao.es.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 学生课程中间表的数据库操作
 * 
 * @author 刘美彤
 * @version 1.0
 * 
 */
public class StudentCourseDAO {
	/**
	 * 判断某个学生是否选了某个课程
	 * 
	 * @param studentId
	 *            学生id
	 * @param courseId
	 *            课程id
	 * @return boolean
	 */
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

	/**
	 * 选课
	 * 
	 * @param studentId
	 *            学生id
	 * @param courseId
	 *            课程id
	 * @return int (-1表示已选,1表示选课成功,0表示莫名错误)
	 */
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

	/**
	 * 撤课
	 * 
	 * @param studentId
	 *            学生id
	 * @param courseId
	 *            课程id
	 * @return int (1表示撤课成功,0代表莫名错误)
	 */
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
