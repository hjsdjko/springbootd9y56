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


import com.dao.ZichanshengouDao;
import com.entity.ZichanshengouEntity;
import com.service.ZichanshengouService;
import com.entity.vo.ZichanshengouVO;
import com.entity.view.ZichanshengouView;

@Service("zichanshengouService")
public class ZichanshengouServiceImpl extends ServiceImpl<ZichanshengouDao, ZichanshengouEntity> implements ZichanshengouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanshengouEntity> page = this.selectPage(
                new Query<ZichanshengouEntity>(params).getPage(),
                new EntityWrapper<ZichanshengouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanshengouEntity> wrapper) {
		  Page<ZichanshengouView> page =new Query<ZichanshengouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanshengouVO> selectListVO(Wrapper<ZichanshengouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanshengouVO selectVO(Wrapper<ZichanshengouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanshengouView> selectListView(Wrapper<ZichanshengouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanshengouView selectView(Wrapper<ZichanshengouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZichanshengouEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZichanshengouEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZichanshengouEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
