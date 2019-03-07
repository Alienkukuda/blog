package ssm.blog.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.blog.entity.Blog;
import ssm.blog.entity.Comment;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by Captain on 2019/3/7
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CommentDaoTest {

	@Resource
	private CommentDao commentDao;

	@Test
	public void addBlogType() throws Exception {
		Date date = new Date();
		Blog blog = new Blog(1);
		Comment comment = new Comment(4,"192.168.210.111","真的牛皮",date,0,blog);
		int result = commentDao.saveComment(comment);
		System.out.println(result);
	}

	@Test
	public void listComment(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("state",0);
		Long result = commentDao.getTotal(map);
		System.out.println(result);
	}

	@Test
	public void listByPage(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("state",0);
		map.put("blogId",1);
		map.put("start",0);
		map.put("end",10);
		List<Comment> commentList = commentDao.listByPage(map);
		for (Comment comment: commentList) {
			System.out.println(comment.getId());
		}
	}

}
