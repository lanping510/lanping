package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.GoodsService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Goods;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class GoodsServiceImpl extends BaseService implements GoodsService {

	/**
	 * 新增
	 * 
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	public int insertGoods(Goods goods) throws Exception {
		return super.getSqlSession().insert("insertGoods", goods);
	}

	/**
	 * 修改
	 * 
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	public int updateGoods(Goods goods) throws Exception {
		return super.getSqlSession().update("updateGoods", goods);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteGoods(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteGoods", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Goods selectGoodsByGid(Integer gid) throws Exception {
		return super.getSqlSession().selectOne("selectGoodsByGid",gid);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Goods> selectGoodsList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectGoodsList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Goods> selectAllGoodsList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllGoodsList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectGoodsListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectGoodsListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}