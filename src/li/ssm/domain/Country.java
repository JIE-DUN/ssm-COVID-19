package li.ssm.domain;

import java.util.List;

/**
 * 国家类
 *
 */
public class Country {
	private Integer id;
	private String name;
	private int curConfirm;
	private int confirmed;
	private int cured;
	private int died;
	private List<Province> provinces;

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

	public int getCurConfirm() {
		return curConfirm;
	}

	public void setCurConfirm(int curConfirm) {
		this.curConfirm = curConfirm;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public int getCured() {
		return cured;
	}

	public void setCured(int cured) {
		this.cured = cured;
	}

	public int getDied() {
		return died;
	}

	public void setDied(int died) {
		this.died = died;
	}

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}

}
