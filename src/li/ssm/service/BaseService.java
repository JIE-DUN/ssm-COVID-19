package li.ssm.service;

import java.util.List;

public interface BaseService<T> {
	public void insert(T t);
	public void update(T t);
	public void delete(Integer id);
	public T selectOne(Integer id);
	public List<T> selectAll();

	
	/**
	 * 查询数据条数，主要作用是计算分页查询的页数
	 */
	public int selectCount();
	public int selectCount(Integer id);
}
