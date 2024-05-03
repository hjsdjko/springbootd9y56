package com.dao;

import com.entity.ZichanshenlingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanshenlingVO;
import com.entity.view.ZichanshenlingView;


/**
 * 资产申领
 * 
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanshenlingDao extends BaseMapper<ZichanshenlingEntity> {
	
	List<ZichanshenlingVO> selectListVO(@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
	
	ZichanshenlingVO selectVO(@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
	
	List<ZichanshenlingView> selectListView(@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);

	List<ZichanshenlingView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
	
	ZichanshenlingView selectView(@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
}
