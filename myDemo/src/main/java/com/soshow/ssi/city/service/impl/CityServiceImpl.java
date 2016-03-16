package com.soshow.ssi.city.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.soshow.ssi.city.dao.CityDao;
import com.soshow.ssi.city.dto.City;
import com.soshow.ssi.city.dto.CityCondition;
import com.soshow.ssi.city.service.CityService;

/**
 * 
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class CityServiceImpl implements CityService{

	@Resource
	private CityDao cityDao;
	
	public Long add(City po) {
		return cityDao.add(po);
	}
	
	public int delete(Long id) {
		return cityDao.delete(id);
	}
	
	public int update(City po) {
		return cityDao.update(po);
	}
	
	public City findById(Long id) {
		return cityDao.findById(id);
	}
	
	public List<City> findPageByCondition(CityCondition pc) {
		return cityDao.findPageByCondition(pc);
	}
}
