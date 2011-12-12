package org.xiaoxiao.es.util;

import java.util.ArrayList;
import java.util.List;

import org.xiaoxiao.es.model.Course;

/**
 * Course工具类
 * 
 * @author 刘美彤
 * @version 1.0
 * 
 */
public class CourseUtil {
	/**
	 * 将课程里面的开课时间整理出来
	 * 
	 * @param c
	 *            课程对象
	 * @return List<String>
	 */
	public static List<String> getTimeDetail(Course c) {
		List<String> result = new ArrayList<String>();
		result.add("第" + c.getBeginWeek() + "周到" + "第" + c.getEndWeek() + "周");
		String[] strs = c.getCourseTime().split(";");
		for (int i = 0, l = strs.length; i < l; i++) {
			String str = strs[i];
			int pos = str.indexOf(":");
			result.add("周" + str.substring(0, pos) + "第"
					+ str.substring(pos + 1) + "节");

		}
		return result;
	}
}
