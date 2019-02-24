package ssm.blog.entity;

import java.io.Serializable;

/**
 * created by Captain on 2019/2/23
 * @Description 博客类别实体类
 **/
public class BlogType implements Serializable {
	private Integer id;
	private String typeName;
	private Integer orderNum;

	public BlogType() {
	}

	public BlogType(Integer id, String typeName, Integer orderNum) {
		this.id = id;
		this.typeName = typeName;
		this.orderNum = orderNum;
	}

	public BlogType(String typeName, Integer orderNum) {
		this.typeName = typeName;
		this.orderNum = orderNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "BlogType{" +
				"id=" + id +
				", typeName='" + typeName + '\'' +
				", orderNum=" + orderNum +
				'}';
	}
}
