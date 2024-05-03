package com.dao;

import com.entity.ZichanchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanchukuVO;
import com.entity.view.ZichanchukuView;


/**
 * 资产出库
 * 
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanchukuDao extends BaseMapper<ZichanchukuEntity> {
	
	List<ZichanchukuVO> selectListVO(@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
	
	ZichanchukuVO selectVO(@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
	
	List<ZichanchukuView> selectListView(@Param("ew") Wrapper<ZichanchukuEntity> wrapper);

	List<ZichanchukuView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
	
	ZichanchukuView selectView(@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanchukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
}
