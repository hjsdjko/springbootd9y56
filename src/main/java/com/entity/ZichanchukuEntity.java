package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 资产出库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
@TableName("zichanchuku")
public class ZichanchukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichanchukuEntity() {
		
	}
	
	public ZichanchukuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 资产编码
	 */
					
	private String zichanbianma;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资产编码
	 */
	public void setZichanbianma(String zichanbianma) {
		this.zichanbianma = zichanbianma;
	}
	/**
	 * 获取：资产编码
	 */
	public String getZichanbianma() {
		return zichanbianma;
	}
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
