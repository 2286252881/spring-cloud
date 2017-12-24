package com.tangcco.employee.beans;

public class Recruit {
	private Integer id;

	private String name;

	private Integer count;

	private String record;

	private Integer compId;

	private String experience;

	private String reqired;

	private String createBy;

	private Integer state;

	// 公司地址
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record == null ? null : record.trim();
	}

	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience == null ? null : experience.trim();
	}

	public String getReqired() {
		return reqired;
	}

	public void setReqired(String reqired) {
		this.reqired = reqired == null ? null : reqired.trim();
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}