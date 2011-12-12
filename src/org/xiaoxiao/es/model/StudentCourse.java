package org.xiaoxiao.es.model;

/**
 * 
 * 学生课程中间表对应的Model类
 * 
 * @author Ruby
 * @version 1.0
 * 
 */
public class StudentCourse {
	/**
	 * 表ID
	 */
	private Integer id;
	/**
	 * 学生ID
	 */
	private Integer studentId;
	/**
	 * 课程ID
	 */
	private Integer courseId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
}
