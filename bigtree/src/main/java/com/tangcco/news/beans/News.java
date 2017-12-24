package com.tangcco.news.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "news")
public class News {
	@Id
	private Integer id;

	private String title;

	private Integer type;

	private Integer state;

	private Date date;

	private Integer count;

	private Integer isNew;

	private Integer isHot;

	private String cover;

	private String img;
	@Column(name = "half_content")
	private String halfContent;

	private String createBy;

	@Column(name = "all_content")
	private String allContent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover == null ? null : cover.trim();
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public String getHalfContent() {
		return halfContent;
	}

	public void setHalfContent(String halfContent) {
		this.halfContent = halfContent == null ? null : halfContent.trim();
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public String getAllContent() {
		return allContent;
	}

	public void setAllContent(String allContent) {
		this.allContent = allContent == null ? null : allContent.trim();
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", type=" + type + ", state=" + state + ", date=" + date
				+ ", count=" + count + ", isNew=" + isNew + ", isHot=" + isHot + ", cover=" + cover + ", img=" + img
				+ ", halfContent=" + halfContent + ", createBy=" + createBy + ", allContent=" + allContent + "]";
	}

}