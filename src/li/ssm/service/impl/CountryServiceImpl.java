package li.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import li.ssm.dao.BaseDao;
import li.ssm.domain.Country;
import li.ssm.service.CountryService;



@Service("countryService")
public class CountryServiceImpl extends BaseServiceImpl<Country> implements CountryService {
	
	//@Resource是注入，注入指定dao
	@Resource(name="countryDao")
	public void setDao(BaseDao<Country> dao) {
		super.setDao(dao);
	}

	public void longTx() {
		
	}
	
	/**
	 * 将修改数据（更新）和新增数据（插入）结合在一起
	 * 不用了
	 */
	public void save(Country c){
	}

	
	public List<Country> selectPage(int offest, int len) {
		return getDao().selectPage(offest, len);
	}


}
