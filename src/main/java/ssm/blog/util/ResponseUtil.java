package ssm.blog.util;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * created by Captain on 2019/2/24
 **/
public class ResponseUtil {
	/**
	 * 向response对象写入数据
	 * @param response
	 * @param obj
	 * @throws Exception
	 */
	public static void write(HttpServletResponse response, Object obj)throws Exception{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(obj.toString());
		out.flush();
		out.close();
	}
}
