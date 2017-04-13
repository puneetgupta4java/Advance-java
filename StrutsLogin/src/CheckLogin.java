import com.opensymphony.xwork2.ActionSupport;

public class CheckLogin extends ActionSupport {
   
	 String userid;
	 String pwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String login(){
		if(userid.equals(pwd)){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
}
