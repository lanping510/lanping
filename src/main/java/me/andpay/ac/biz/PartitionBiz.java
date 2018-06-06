package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Partition;
import me.andpay.ac.service.PartitionService;
import me.andpay.ac.utils.ConstantUtil;

import me.andpay.ac.utils.JSONEntity;

/**
 * 业务处理类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class PartitionBiz {

	@Resource
	private PartitionService partitionService;

	/**
	 * 查询Partition集合
	 */
	public JSONEntity<List<Partition>> partitionList(Map<String, Object> map) throws Exception{
		List<Partition> partitions = partitionService.selectPartitionList(map);
		int total = partitionService.selectPartitionListCount(map);
		return new JSONEntity<List<Partition>>(ConstantUtil.CODE_200, partitions, total);
	}

	/**
	 * 根据id查询Partition
	 */
	public JSONEntity<Partition> partitionById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Partition partition = partitionService.selectPartitionById(Integer.parseInt(id));
			return new JSONEntity<Partition>(ConstantUtil.CODE_200, partition);
		} else {
			return new JSONEntity<Partition>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Partition
	 */
	public JSONEntity<Partition> insertPartition(Partition partition) throws Exception{
		partitionService.insertPartition(partition);
		return new JSONEntity<Partition>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Partition
	 */
	public JSONEntity<Partition> updatePartition(Partition partition) throws Exception{
		partitionService.updatePartition(partition);
		return new JSONEntity<Partition>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Partition
	 */
	public JSONEntity<Partition> deletePartition(Map<String, Object> map) throws Exception{
		partitionService.deletePartition(map);
		return new JSONEntity<Partition>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}