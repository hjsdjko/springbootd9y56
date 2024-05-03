package com.entity.vo;

import com.entity.ZichanshengouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资产申购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public class ZichanshengouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 资产说明
	 */
	
	private String zichanshuoming;
		
	/**
	 * 申购原因
	 */
	
	private String shengouyuanyin;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 科室号
	 */
	
	private String keshihao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：资产说明
	 */
	 
	public void setZichanshuoming(String zichanshuoming) {
		this.zichanshuoming = zichanshuoming;
	}
	
	/**
	 * 获取：资产说明
	 */
	public String getZichanshuoming() {
		return zichanshuoming;
	}
				
	
	/**
	 * 设置：申购原因
	 */
	 
	public void setShengouyuanyin(String shengouyuanyin) {
		this.shengouyuanyin = shengouyuanyin;
	}
	
	/**
	 * 获取：申购原因
	 */
	public String getShengouyuanyin() {
		return shengouyuanyin;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：科室号
	 */
	 
	public void setKeshihao(String keshihao) {
		this.keshihao = keshihao;
	}
	
	/**
	 * 获取：科室号
	 */
	public String getKeshihao() {
		return keshihao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
