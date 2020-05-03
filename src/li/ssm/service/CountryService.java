package li.ssm.service;

import java.util.List;

import li.ssm.domain.Country;


/**
 * 
 *
 */
public interface CountryService extends BaseService<Country> {
	public void longTx();
	
	public void save(Country c);

	public List<Country> selectPage(int offest, int len);
}
