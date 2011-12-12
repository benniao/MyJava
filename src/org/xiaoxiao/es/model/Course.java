package org.xiaoxiao.es.model;

/**
 * 
 * 课程表对应的Model类
 * 
 * @author 聂亚杰
 * @version 1.0
 * 
 */
public class Course {
	/**
	 * 课程表ID
	 */
	private Integer id;
	/**
	 * 课程名称
	 */
	private String name;
	/**
	 * 任课老师
	 */
	private String teacher;
	/**
	 * 开始周
	 */
	private Integer beginWeek;
	/**
	 * 结束周
	 */
	private Integer endWeek;
	/**
	 * 上课时间(1:2-4;3:5-6表示周一的第二到第四节和周三的第五到第六节要上课)
	 */
	private String courseTime;
	/**
	 * 上课地址
	 */
	private String address;
	/**
	 * 学分
	 */
	private Integer grade;
	/**
	 * 限制人数
	 */
	private Integer studentNum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Integer getBeginWeek() {
		return beginWeek;
	}
	public void setBeginWeek(Integer beginWeek) {
		this.beginWeek = beginWeek;
	}
	public Integer getEndWeek() {
		return endWeek;
	}
	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(Integer studentNum) {
		this.studentNum = studentNum;
	}
	
}
