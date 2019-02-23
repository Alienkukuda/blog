package ssm.blog.service;

import ssm.blog.entity.BlogType;
import ssm.blog.entity.PageBean;

/**
 * created by Captain on 2019/2/23
 * @Description 博客类别service接口
 **/
public interface BlogTypeService {

	//分页查询
	PageBean<BlogType> listByPage(PageBean<BlogType> pageBean);

}
