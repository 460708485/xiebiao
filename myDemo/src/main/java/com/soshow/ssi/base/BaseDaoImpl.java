package com.soshow.ssi.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

/**
 * 
 * @version 1.0
 * @author xieb
 * @date 2014年12月4日 上午9:50:35
 *
 */
public class BaseDaoImpl<T,K> implements BaseDao<T,K> {

	@Resource
	protected SqlMapClientTemplate sqlMapClientTemplate;
	
	@SuppressWarnings("unchecked")
	private Class<T> poClass = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];
	String poClassName = poClass.getSimpleName();
	

	public Long add(T po) {
		return (Long) this.sqlMapClientTemplate.insert(poClassName+".add", po);
	}
	public int update(T po) {
		return this.sqlMapClientTemplate.update(poClassName+".update", po);
	}
	public int delete(Long id) {
		return this.sqlMapClientTemplate.delete(poClassName+".delete", id);
	}

	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		return (T) this.sqlMapClientTemplate.queryForObject(poClassName+".findById", id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findPageByCondition(K pc) {
		return (List<T>) this.sqlMapClientTemplate.queryForList(poClassName+".findPageByCondition", pc);
	}
	
	/** 批量增删改查*/
	public void insertBat(List<T> list) {
		// TODO Auto-generated method stub
	}
	
	public void updateBatch(List<T> list) {
		// TODO Auto-generated method stub
		
	}
	public int deleteBatch(String ids) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int batchAdd(String method, Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}
}
