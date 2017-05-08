package com.strutstart.pojo;

public class WelcomeAction {

	private String userid;
	private String pass;
	private String message;
	
	public String login(){
		if(userid.equals(pass)){
			setMessage("welcome " + userid);
			return "sucess";
		}
		else{
			setMessage("invalid userid or password");
			return "error";
	}
	}		
	public String saywelcome(){
		setMessage("hello moto");
		return "sucess";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		//System.out.println(userid);
		this.userid = userid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
