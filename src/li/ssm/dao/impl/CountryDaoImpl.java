package li.ssm.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import li.ssm.dao.BaseDao;
import li.ssm.domain.Country;


@Repository("countryDao")
public class CountryDaoImpl extends SqlSessionDaoSupport implements BaseDao<Country> {

	public void insert(Country user) {
		getSqlSession().insert("counties.insert",user);
	}

	public void update(Country user) {
		getSqlSession().update("counties.update",user);
		
	}

	public void delete(Integer id) {
		getSqlSession().delete("counties.delete",id);
		
	}

	public Country selectOne(Integer id) {
		return getSqlSession().selectOne("counties.selectOne",id);
	}

	public List<Country> selectAll() {
		return getSqlSession().selectList("counties.selectAll");
	}

	/**
	 * 分页查询
	 */
	public List<Country> selectPage(int offest, int len) {
		return getSqlSession().selectList("counties.selectPage",new RowBounds(offest,len));
	}
	@Override
	public List<Country> selectPage(int offest, int len, int cid) {
		return null;
	}

	/**
	 * 查询数据条数，主要作用是计算分页查询的页数
	 */
	public int selectCount() {
		return getSqlSession().selectOne("counties.selectCount");
	}

	@Override
	public int selectCount(Integer id) {
		return 0;
	}


	
}
