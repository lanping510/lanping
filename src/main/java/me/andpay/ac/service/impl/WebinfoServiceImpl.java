package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.WebinfoService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Webinfo;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class WebinfoServiceImpl extends BaseService implements WebinfoService {

	/**
	 * 新增
	 * 
	 * @param webinfo
	 * @return
	 * @throws Exception
	 */
	public int insertWebinfo(Webinfo webinfo) throws Exception {
		return super.getSqlSession().insert("insertWebinfo", webinfo);
	}

	/**
	 * 修改
	 * 
	 * @param webinfo
	 * @return
	 * @throws Exception
	 */
	public int updateWebinfo(Webinfo webinfo) throws Exception {
		return super.getSqlSession().update("updateWebinfo", webinfo);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteWebinfo(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteWebinfo", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Webinfo selectWebinfoById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectWebinfoById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Webinfo> selectWebinfoList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectWebinfoList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Webinfo> selectAllWebinfoList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllWebinfoList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectWebinfoListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectWebinfoListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}