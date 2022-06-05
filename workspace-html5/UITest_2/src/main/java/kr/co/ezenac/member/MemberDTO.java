package kr.co.ezenac.member;

import java.util.Date;

public class MemberDTO {
	
	private String id;
	private String pwd;
	private Date date= new Date(); 
	
	public MemberDTO() {
		
	}
	public MemberDTO(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
