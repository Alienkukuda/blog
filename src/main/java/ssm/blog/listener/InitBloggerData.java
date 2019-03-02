package ssm.blog.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import ssm.blog.entity.BlogType;
import ssm.blog.entity.Blogger;
import ssm.blog.service.BlogService;
import ssm.blog.service.BlogTypeService;
import ssm.blog.service.BloggerService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

@Component
/**
 * @Author captain
 * @Description 监听程序初始化
 * @Date 2019/2/28 00:56
 */
public class InitBloggerData implements ServletContextListener, ApplicationContextAware {

	private static ApplicationContext applicationContext;
	
	public void contextInitialized(ServletContextEvent sce) {
		//先获取servlet上下文
		ServletContext application = sce.getServletContext();
		//同上，获取博客类别信息service
		BlogTypeService blogTypeService = applicationContext.getBean(BlogTypeService.class);
		//获取博主信息service
		BlogService blogService = applicationContext.getBean(BlogService.class);
		//获取博客信息
		BloggerService bloggerService = applicationContext.getBean(BloggerService.class);
		//获取博客service
		List<BlogType> blogTypeList = blogTypeService.getBlogTypeData();
		application.setAttribute("blogTypeList", blogTypeList);
		//获取博主信息
		Blogger blogger = bloggerService.getBloggerData();
		//隐藏密码
		blogger.setPassword(null);
		application.setAttribute("blogger",blogger);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) 
			throws BeansException {
		InitBloggerData.applicationContext = applicationContext;
	}

}
