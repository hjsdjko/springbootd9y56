package com.entity.model;

import com.entity.GudingzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 固定资产
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public class GudingzichanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资产名称
	 */
	
	private String zichanmingcheng;
		
	/**
	 * 资产类型
	 */
	
	private String zichanleixing;
		
	/**
	 * 资产图片
	 */
	
	private String zichantupian;
		
	/**
	 * 资产单价
	 */
	
	private Integer zichandanjia;
		
	/**
	 * 资产数量
	 */
	
	private Integer zichanshuliang;
		
	/**
	 * 资产总价
	 */
	
	private String zichanzongjia;
		
	/**
	 * 使用状况
	 */
	
	private String shiyongzhuangkuang;
		
	/**
	 * 购买时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumaishijian;
		
	/**
	 * 资产详情
	 */
	
	private String zichanxiangqing;
		
	/**
	 * 归属说明
	 */
	
	private String guishushuoming;
		
	/**
	 * 使用描述
	 */
	
	private String shiyongmiaoshu;
				
	
	/**
	 * 设置：资产名称
	 */
	 
	public void setZichanmingcheng(String zichanmingcheng) {
		this.zichanmingcheng = zichanmingcheng;
	}
	
	/**
	 * 获取：资产名称
	 */
	public String getZichanmingcheng() {
		return zichanmingcheng;
	}
				
	
	/**
	 * 设置：资产类型
	 */
	 
	public void setZichanleixing(String zichanleixing) {
		this.zichanleixing = zichanleixing;
	}
	
	/**
	 * 获取：资产类型
	 */
	public String getZichanleixing() {
		return zichanleixing;
	}
				
	
	/**
	 * 设置：资产图片
	 */
	 
	public void setZichantupian(String zichantupian) {
		this.zichantupian = zichantupian;
	}
	
	/**
	 * 获取：资产图片
	 */
	public String getZichantupian() {
		return zichantupian;
	}
				
	
	/**
	 * 设置：资产单价
	 */
	 
	public void setZichandanjia(Integer zichandanjia) {
		this.zichandanjia = zichandanjia;
	}
	
	/**
	 * 获取：资产单价
	 */
	public Integer getZichandanjia() {
		return zichandanjia;
	}
				
	
	/**
	 * 设置：资产数量
	 */
	 
	public void setZichanshuliang(Integer zichanshuliang) {
		this.zichanshuliang = zichanshuliang;
	}
	
	/**
	 * 获取：资产数量
	 */
	public Integer getZichanshuliang() {
		return zichanshuliang;
	}
				
	
	/**
	 * 设置：资产总价
	 */
	 
	public void setZichanzongjia(String zichanzongjia) {
		this.zichanzongjia = zichanzongjia;
	}
	
	/**
	 * 获取：资产总价
	 */
	public String getZichanzongjia() {
		return zichanzongjia;
	}
				
	
	/**
	 * 设置：使用状况
	 */
	 
	public void setShiyongzhuangkuang(String shiyongzhuangkuang) {
		this.shiyongzhuangkuang = shiyongzhuangkuang;
	}
	
	/**
	 * 获取：使用状况
	 */
	public String getShiyongzhuangkuang() {
		return shiyongzhuangkuang;
	}
				
	
	/**
	 * 设置：购买时间
	 */
	 
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
	}
				
	
	/**
	 * 设置：资产详情
	 */
	 
	public void setZichanxiangqing(String zichanxiangqing) {
		this.zichanxiangqing = zichanxiangqing;
	}
	
	/**
	 * 获取：资产详情
	 */
	public String getZichanxiangqing() {
		return zichanxiangqing;
	}
				
	
	/**
	 * 设置：归属说明
	 */
	 
	public void setGuishushuoming(String guishushuoming) {
		this.guishushuoming = guishushuoming;
	}
	
	/**
	 * 获取：归属说明
	 */
	public String getGuishushuoming() {
		return guishushuoming;
	}
				
	
	/**
	 * 设置：使用描述
	 */
	 
	public void setShiyongmiaoshu(String shiyongmiaoshu) {
		this.shiyongmiaoshu = shiyongmiaoshu;
	}
	
	/**
	 * 获取：使用描述
	 */
	public String getShiyongmiaoshu() {
		return shiyongmiaoshu;
	}
			
}
