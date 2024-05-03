package com.entity.view;

import com.entity.ZichanshengouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产申购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
@TableName("zichanshengou")
public class ZichanshengouView  extends ZichanshengouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanshengouView(){
	}
 
 	public ZichanshengouView(ZichanshengouEntity zichanshengouEntity){
 	try {
			BeanUtils.copyProperties(this, zichanshengouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
