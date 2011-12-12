package org.xiaoxiao.es.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.xiaoxiao.es.model.Course;

public class CourseDAO {
	public static List<Course> findAllCourse() {
		List<Course> courseList = new ArrayList<Course>();
		try {
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("SELECT * FROM COURSE");
			Course course;
			while (rs.next()) {
				course = new Course();
				course.setId(rs.getInt("id"));
				course.setName(rs.getString("name"));
				course.setTeacher(rs.getString("teacher"));
				course.setBeginWeek(rs.getInt("begin_week"));
				course.setEndWeek(rs.getInt("end_week"));
				course.setCourseTime(rs.getString("course_time"));
				course.setAddress(rs.getString("address"));
				course.setGrade(rs.getInt("grade"));
				course.setStudentNum(rs.getInt("student_num"));
				courseList.add(course);
			}
			rs.close();
			stat.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return courseList;
	}

	public static List<Course> findByStudentId(int studentId) {
		List<Course> courseList = new ArrayList<Course>();
		try {
			Connection conn = DBUtil.createConnection();
			Statement stat = conn.createStatement();
			ResultSet rs = stat
					.executeQuery("SELECT * FROM COURSE WHERE id=(select course_id from STUDENT_COURSE WHERE student_id="
							+ studentId + ")");
			Course course;
			while (rs.next()) {
				course = new Course();
				course.setId(rs.getInt("id"));
				course.setName(rs.getString("name"));
				course.setTeacher(rs.getString("teacher"));
				course.setBeginWeek(rs.getInt("begin_week"));
				course.setEndWeek(rs.getInt("end_week"));
				course.setCourseTime(rs.getString("course_time"));
				course.setAddress(rs.getString("address"));
				course.setGrade(rs.getInt("grade"));
				course.setStudentNum(rs.getInt("student_num"));
				courseList.add(course);
			}
			rs.close();
			stat.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return courseList;
	}
}
