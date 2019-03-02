package ssm.blog.service;

import org.springframework.stereotype.Service;
import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;

import javax.annotation.Resource;

/**
 * created by Captain on 2019/3/2
 **/
@Service
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;

	public Blogger getBloggerData() {
		return bloggerDao.getBloggerData();
	}

	public Blogger getBloggerByName(String username) {
		return bloggerDao.getBloggerByName(username);
	}

	public Integer updateBlogger(Blogger blogger) {
		return bloggerDao.updateBlogger(blogger);
	}
}
