package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanshengouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanshengouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanshengouView;


/**
 * 资产申购
 *
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface ZichanshengouService extends IService<ZichanshengouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanshengouVO> selectListVO(Wrapper<ZichanshengouEntity> wrapper);
   	
   	ZichanshengouVO selectVO(@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
   	
   	List<ZichanshengouView> selectListView(Wrapper<ZichanshengouEntity> wrapper);
   	
   	ZichanshengouView selectView(@Param("ew") Wrapper<ZichanshengouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanshengouEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZichanshengouEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZichanshengouEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZichanshengouEntity> wrapper);
}

