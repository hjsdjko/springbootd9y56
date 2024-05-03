package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZichanchukuDao;
import com.entity.ZichanchukuEntity;
import com.service.ZichanchukuService;
import com.entity.vo.ZichanchukuVO;
import com.entity.view.ZichanchukuView;

@Service("zichanchukuService")
public class ZichanchukuServiceImpl extends ServiceImpl<ZichanchukuDao, ZichanchukuEntity> implements ZichanchukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanchukuEntity> page = this.selectPage(
                new Query<ZichanchukuEntity>(params).getPage(),
                new EntityWrapper<ZichanchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanchukuEntity> wrapper) {
		  Page<ZichanchukuView> page =new Query<ZichanchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanchukuVO> selectListVO(Wrapper<ZichanchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanchukuVO selectVO(Wrapper<ZichanchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanchukuView> selectListView(Wrapper<ZichanchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanchukuView selectView(Wrapper<ZichanchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZichanchukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZichanchukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZichanchukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
