package com.entity.vo;

import com.entity.ZichanchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资产出库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public class ZichanchukuVO  implements Serializable {
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
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
		
	/**
	 * 出库说明
	 */
	
	private String chukushuoming;
				
	
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
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
				
	
	/**
	 * 设置：出库说明
	 */
	 
	public void setChukushuoming(String chukushuoming) {
		this.chukushuoming = chukushuoming;
	}
	
	/**
	 * 获取：出库说明
	 */
	public String getChukushuoming() {
		return chukushuoming;
	}
			
}
