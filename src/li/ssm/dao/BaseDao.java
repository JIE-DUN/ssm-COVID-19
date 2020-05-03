package li.ssm.dao;

import java.util.List;

/**
 * 基本Dao接口
 */
public interface BaseDao<T> {
	public void insert(T t);
	public void update(T t);
	public void delete(Integer id);
	public T selectOne(Integer id);
	public List<T> selectAll();
	public List<T> selectPage(int offest, int len);
	public List<T> selectPage(int offest, int len,int cid);
	public int selectCount();
	//这个主要服务于查询省份时，要指定哪个国家，所以会传递那个国家的id
	public int selectCount(Integer id);
	
}
