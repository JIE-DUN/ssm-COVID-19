package li.ssm.service.impl;

import java.util.List;

import li.ssm.dao.BaseDao;
import li.ssm.service.BaseService;



public abstract class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> dao ;
	
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}
	
	public BaseDao<T> getDao() {
		return dao;
	}

	public void insert(T t) {
		dao.insert(t);
	}

	public void update(T t) {
		dao.update(t);
	}
	
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	public T selectOne(Integer id) {
		return dao.selectOne(id);
	}

	public List<T> selectAll() {
		return dao.selectAll();
	}


	/**
	 * 查询数据条数，主要作用是计算分页查询的页数
	 */
	public int selectCount() {
		return dao.selectCount();
	}
	public int selectCount(Integer id) {
		return dao.selectCount(id);
	}
	
}
