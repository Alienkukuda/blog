package ssm.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ssm.blog.entity.BlogType;

import java.util.List;

/**
 * created by Captain on 2019/2/23
 * @Description 博客类别dao
 **/
@Repository
public interface BlogTypeDao {
	/**
	 * 添加博客类别信息
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);

	/**
	 * 删除博客类别信息
	 * @param id
	 * @return
	 */
	Integer deleteBlogType(Integer id);

	/**
	 * 更新博客类别信息
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);

	/**
	 * 根据id查询博客类别信息
	 * @param id
	 * @return
	 */
	BlogType getById(Integer id);

	/**
	 * 分页查询博客类别信息
	 * @param start
	 * @param end
	 * @return
	 */
	List<BlogType> listByPage(@Param("start") Integer start, @Param("end") Integer end);

	/**
	 * 查询总记录数
	 * @return
	 */
	Long getTotal();

	/**
	 * 获取博客类别信息
	 */
	List<BlogType> getBlogTypeData();
}
