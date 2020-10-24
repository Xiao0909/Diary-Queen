package com.Group2.DiaryQueen.model;

public class DiaryHome {
	private int id;
	private String date;
	private String time;
	private String title;
	private String shortDescription;

	
	public DiaryHome(){
		
	}
	
	public DiaryHome(int id, String date, String time, String title, String shortDescription){
		this.id = id;
		this.date = date;
		this.time = time;
		this.title = title;
		this.shortDescription = shortDescription;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	@Override
	public String toString() {
		return "DiaryHome [id=" + id + ", date=" + date + ", time=" + time + ",title=" + title + ",shortDescription=" + shortDescription + "]";
	}

}
