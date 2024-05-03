package com.entity.view;

import com.entity.ZichanshenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产申领
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
@TableName("zichanshenling")
public class ZichanshenlingView  extends ZichanshenlingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanshenlingView(){
	}
 
 	public ZichanshenlingView(ZichanshenlingEntity zichanshenlingEntity){
 	try {
			BeanUtils.copyProperties(this, zichanshenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
