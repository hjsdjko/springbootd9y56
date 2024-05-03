package com.dao;

import com.entity.ZichanshengouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanshengouVO;
import com.entity.view.ZichanshengouView;


/**
 * 资产申购
 * 
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanshengouDao extends BaseMapper<ZichanshengouEntity> {
	
	List<ZichanshengouVO> selectListVO(@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
	
	ZichanshengouVO selectVO(@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
	
	List<ZichanshengouView> selectListView(@Param("ew") Wrapper<ZichanshengouEntity> wrapper);

	List<ZichanshengouView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
	
	ZichanshengouView selectView(@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanshengouEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanshengouEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
}
