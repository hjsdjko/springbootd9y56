package com.dao;

import com.entity.ZichanrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanrukuVO;
import com.entity.view.ZichanrukuView;


/**
 * 资产入库
 * 
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanrukuDao extends BaseMapper<ZichanrukuEntity> {
	
	List<ZichanrukuVO> selectListVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	ZichanrukuVO selectVO(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	List<ZichanrukuView> selectListView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);

	List<ZichanrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	
	ZichanrukuView selectView(@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanrukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanrukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanrukuEntity> wrapper);
}
