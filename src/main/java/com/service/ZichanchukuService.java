package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanchukuView;


/**
 * 资产出库
 *
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanchukuService extends IService<ZichanchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanchukuVO> selectListVO(Wrapper<ZichanchukuEntity> wrapper);
   	
   	ZichanchukuVO selectVO(@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
   	
   	List<ZichanchukuView> selectListView(Wrapper<ZichanchukuEntity> wrapper);
   	
   	ZichanchukuView selectView(@Param("ew") Wrapper<ZichanchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanchukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZichanchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZichanchukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZichanchukuEntity> wrapper);
}

