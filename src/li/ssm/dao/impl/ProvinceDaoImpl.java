package li.ssm.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import li.ssm.dao.BaseDao;
import li.ssm.domain.Province;

@Repository("provinceDao")
public class ProvinceDaoImpl extends SqlSessionDaoSupport implements BaseDao<Province> {

	public void insert(Province o) {
		getSqlSession().insert("provinces.insert",o);
		
	}

	public void update(Province o) {
		getSqlSession().update("provinces.update",o);
	}

	public void delete(Integer id) {
		getSqlSession().delete("provinces.delete",id);
		
	}

	public Province selectOne(Integer id) {
		return getSqlSession().selectOne("provinces.selectOne",id);
	}

	public List<Province> selectAll() {
		return getSqlSession().selectList("provinces.selectAll");
	}

	
	@Override
	public List<Province> selectPage(int offest, int len) {
		return null;
	}
	@Override
	public List<Province> selectPage(int offest, int len, int cid) {
		return getSqlSession().selectList("provinces.selectPage", 1, new RowBounds(offest,len));
	}

	
	@Override
	public int selectCount() {
		return 0;
	}
	@Override
	public int selectCount(Integer id) {
		return getSqlSession().selectOne("provinces.selectCount",id);
	}


	
}
