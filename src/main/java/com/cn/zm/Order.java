package com.cn.zm;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
	private String order_no;
	private String order_name;
	private BigDecimal order_money;
	private String remark;
	private Date order_time;
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	private boolean valid;
	private String uid;
	
	
	public Order(String order_no, String order_name, BigDecimal order_money, String remark, Date order_time,
			boolean valid, String uid, Integer status) {
		super();
		this.order_no = order_no;
		this.order_name = order_name;
		this.order_money = order_money;
		this.remark = remark;
		this.order_time = order_time;
		this.valid = valid;
		this.uid = uid;
		this.status = status;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public BigDecimal getOrder_money() {
		return order_money;
	}
	public void setOrder_money(BigDecimal order_money) {
		this.order_money = order_money;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
