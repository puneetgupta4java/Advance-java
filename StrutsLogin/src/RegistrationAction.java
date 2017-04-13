

public class RegistrationAction {
	private String name,rollnumber,email,gender,mobilenumber,event;  
	  
	/**
	 * @return the rollnumber
	 */
	public String getRollnumber() {
		return rollnumber;
	}

	/**
	 * @param rollnumber the rollnumber to set
	 */
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}

	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}

	//setters and getters  
	public String execute(){  
	    int i=RegistratonConnection.save(this);  
	    if(i>0){  
	    return "success";  
	    }  
	    return "error";  
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}  
	
}
