package li.ssm.domain;

import java.util.List;

/**
 * 省份类
 */
public class Province {
	private Integer id;
	private String name;
	private Integer confirmed;
	private Integer cured;
	private Integer died;
	private Integer cid;
	//建立关联关系
	private Country country;
	
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}

	public Integer getCured() {
		return cured;
	}

	public void setCured(Integer cured) {
		this.cured = cured;
	}

	public Integer getDied() {
		return died;
	}

	public void setDied(Integer died) {
		this.died = died;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}


}
