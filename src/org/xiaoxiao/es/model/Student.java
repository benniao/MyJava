package org.xiaoxiao.es.model;

/**
 * 
 * 学生表对应的Model类
 * 
 * @author Ruby
 * @version 1.0
 * 
 */
public class Student {
	/**
	 * 学生表ID
	 */
	private Integer id;
	/**
	 * 学号
	 */
	private String studentNO;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentNO() {
		return studentNO;
	}

	public void setStudentNO(String studentNO) {
		this.studentNO = studentNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
