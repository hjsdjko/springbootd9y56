package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanshenlingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanshenlingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanshenlingView;


/**
 * 资产申领
 *
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanshenlingService extends IService<ZichanshenlingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanshenlingVO> selectListVO(Wrapper<ZichanshenlingEntity> wrapper);
   	
   	ZichanshenlingVO selectVO(@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
   	
   	List<ZichanshenlingView> selectListView(Wrapper<ZichanshenlingEntity> wrapper);
   	
   	ZichanshenlingView selectView(@Param("ew") Wrapper<ZichanshenlingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanshenlingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZichanshenlingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZichanshenlingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZichanshenlingEntity> wrapper);
}

