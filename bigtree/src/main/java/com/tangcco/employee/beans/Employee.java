package com.tangcco.employee.beans;

import java.util.Date;

public class Employee {
	private Integer id;

	private String name;

	private Integer develId;

	private Integer age;

	private Integer sex;

	private String address;

	private String idCard;

	private Date birthday;

	private Integer compId;

	private Date entryDate;

	private Date leaveDate;

	private Long baseSalary;

	private String img;

	private Long safeSalary;

	private Long realSalary;

	private Integer state;

	private String createBy;

	// 所属部门
	private Development development;

	public Development getDevelopment() {
		return development;
	}

	public void setDevelopment(Development development) {
		this.development = development;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getDevelId() {
		return develId;
	}

	public void setDevelId(Integer develId) {
		this.develId = develId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Long getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Long baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public Long getSafeSalary() {
		return safeSalary;
	}

	public void setSafeSalary(Long safeSalary) {
		this.safeSalary = safeSalary;
	}

	public Long getRealSalary() {
		return realSalary;
	}

	public void setRealSalary(Long realSalary) {
		this.realSalary = realSalary;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}
}