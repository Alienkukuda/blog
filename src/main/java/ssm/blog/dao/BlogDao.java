package ssm.blog.dao;

import ssm.blog.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * created by Captain on 2019/2/25
 * @Description 博客Dao接口
 **/
public interface BlogDao {
	// 分页查询博客
	public List<Blog> listBlog(Map<String, Object> map);

	// 获取总记录数
	public Long getTotal(Map<String ,Object> map);

	// 根据博客类型的id查询该类型下的博客数量
	public Integer getBlogByTypeId(Integer typeId);

	//添加博客
	public Integer saveBlog(Blog blog);

	//更新博客
	public Integer updateBlog(Blog blog);

	//删除博客
	public Integer deleteBlog(Integer id);

	//通过id获取博客
	public Blog getById(Integer id);

	/**
	 * 获取上一篇博客
	 * @param id
	 * @return
	 */
	Blog getPrevBlog(Integer id);
	/**
	 * 获取下一篇博客
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Integer id);
}
