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


import com.dao.ZichanshenlingDao;
import com.entity.ZichanshenlingEntity;
import com.service.ZichanshenlingService;
import com.entity.vo.ZichanshenlingVO;
import com.entity.view.ZichanshenlingView;

@Service("zichanshenlingService")
public class ZichanshenlingServiceImpl extends ServiceImpl<ZichanshenlingDao, ZichanshenlingEntity> implements ZichanshenlingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanshenlingEntity> page = this.selectPage(
                new Query<ZichanshenlingEntity>(params).getPage(),
                new EntityWrapper<ZichanshenlingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanshenlingEntity> wrapper) {
		  Page<ZichanshenlingView> page =new Query<ZichanshenlingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanshenlingVO> selectListVO(Wrapper<ZichanshenlingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanshenlingVO selectVO(Wrapper<ZichanshenlingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanshenlingView> selectListView(Wrapper<ZichanshenlingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanshenlingView selectView(Wrapper<ZichanshenlingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZichanshenlingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZichanshenlingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZichanshenlingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
