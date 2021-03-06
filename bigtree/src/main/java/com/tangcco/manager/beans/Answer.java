package com.tangcco.manager.beans;

import javax.persistence.Column;

public class Answer {
	private Integer id;

	private String name;

	@Column(name = "manager_id")
	private Integer managerId;

	private Integer questionId;

	// 所属用户
//	private Manager manager;
//
//	public Manager getManager() {
//		return manager;
//	}
//
//	public void setManager(Manager manager) {
//		this.manager = manager;
//	}

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

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
}