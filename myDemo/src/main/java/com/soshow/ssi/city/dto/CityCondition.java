package com.soshow.ssi.city.dto;

import com.soshow.ssi.util.Paging;

/**
 * 
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 上午11:07:11
 *
 */
public class CityCondition extends Paging{

	private Long id;
	private String cityName;
	private Long provinceId;

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
