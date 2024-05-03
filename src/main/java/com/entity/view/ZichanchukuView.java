package com.entity.view;

import com.entity.ZichanchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
@TableName("zichanchuku")
public class ZichanchukuView  extends ZichanchukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanchukuView(){
	}
 
 	public ZichanchukuView(ZichanchukuEntity zichanchukuEntity){
 	try {
			BeanUtils.copyProperties(this, zichanchukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
