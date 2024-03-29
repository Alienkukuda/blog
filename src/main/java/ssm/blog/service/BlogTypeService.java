package ssm.blog.service;

import ssm.blog.entity.BlogType;
import ssm.blog.entity.PageBean;

import java.util.List;

/**
 * created by Captain on 2019/2/23
 * @Description 博客类别service接口
 **/
public interface BlogTypeService {

	//分页查询
	PageBean<BlogType> listByPage(PageBean<BlogType> pageBean);

	//获取总记录数
	public Long getTotal();

	//添加博客类别
	public Integer addBlogType(BlogType blogType);

	//更新博客类别
	public Integer updateBlogType(BlogType blogType);

	//删除博客类别
	public Integer deleteBlogType(Integer id);

	public List<BlogType> getBlogTypeData();

}
