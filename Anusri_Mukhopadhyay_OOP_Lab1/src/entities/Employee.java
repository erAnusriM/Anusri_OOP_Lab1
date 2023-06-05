package entities;

public class Employee {
	private String fName;
	private String lName;
	private String dept;
    private String emailAddr;
    private String password;
	
	Employee() {
		this.fName = "Hello";
		this.lName = "World";
		this.dept = "tech";
	}
	
	public Employee(String fname, String lname, String dept) {
		this.fName = fname;
		this.lName = lname;
		this.dept = dept;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
