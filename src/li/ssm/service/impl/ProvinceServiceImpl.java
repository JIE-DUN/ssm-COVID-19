package li.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import li.ssm.dao.BaseDao;
import li.ssm.domain.Province;
import li.ssm.service.ProvinceService;



@Service("provinceService")
public class ProvinceServiceImpl extends BaseServiceImpl<Province> implements ProvinceService {
	
	//@Resource是注入，注入指定dao
	@Resource(name="provinceDao")
	public void setDao(BaseDao<Province> dao) {
		super.setDao(dao);
	}

	public void longTx() {
		
	}

	@Override
	public void save(Province p) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public List<Province> selectPage(int offest, int len, int cid) {
		return getDao().selectPage(offest,len,cid);
	}



}
