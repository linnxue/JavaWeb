package com.pojo;

public class Book {
	private int id;
	private String bname;
	private String pname;
	private String press;
	private int money;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	private String introduction;
	private String cover;
	
	public Book() {}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", pname=" + pname + ", press=" + press + ", money=" + money
				+ ", introduction=" + introduction + ", cover=" + cover + "]";
	}
	
	
}
