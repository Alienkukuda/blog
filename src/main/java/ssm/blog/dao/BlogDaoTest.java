package ssm.blog.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.blog.entity.Blog;
import ssm.blog.service.BlogService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by Captain on 2019/2/25
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class BlogDaoTest {
	@Resource
	private BlogDao blogDao;
	private BlogService blogService;

	@Test
	public void getById(){
		Blog blog = blogDao.getById(1);
		System.out.println(blog.getTitle());
	}

	@Test
	public void getTotal(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("title","测试");
		Long temp = blogDao.getTotal(map);
		System.out.println(temp);
	}
	@Test
	public void listBlog(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start",0);
		map.put("end",10);

		//把分页结果放入pageBean
		List<Blog> blogList = blogDao.listBlog(map);
		for (Blog b: blogList) {
			System.out.println(b.getTitle());
		}
	}

}
