package li.ssm.service;

import java.util.List;

import li.ssm.domain.Province;


/**
 * 
 *
 */
public interface ProvinceService extends BaseService<Province> {
	public void longTx();
	
	public void save(Province p);

	public List<Province> selectPage(int offest, int len,int cid);
}
