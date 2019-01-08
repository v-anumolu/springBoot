package spring;

public class Employee {
	private String eName;
	private int eId;
	private double eSalary;
	private IEmployeeAddress eAddress;
	
	public void seteAddress(IEmployeeAddress eAddress) {
		this.eAddress = eAddress;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
//	public EmployeeAddress geteAddress() {
//		return eAddress;
//	}
//	public void seteAddress(EmployeeAddress eAddress) {
//		this.eAddress = eAddress;
//	} 
	}
