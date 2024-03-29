package ssm.blog.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by Captain on 2019/3/3
 * @Description 日期工具类
 **/
public class DateUtil {
	/**
	 * 日期对象转字符串
	 * @param date
	 * @param format
	 * @return
	 */
	public static String formatDate(Date date, String format){
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null){
			result=sdf.format(date);
		}
		return result;
	}

	/**
	 * 按照yyyyMMddhhmmss 获取当前日期
	 * @return
	 */
	public static String getCurrentDateStr() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(date);
	}
}
