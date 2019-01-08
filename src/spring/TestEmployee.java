package spring;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.seteName("balaram");
		emp.seteId(1234);
		emp.seteSalary(30000.5);
		IEmployeeAddress empHomeAddress = new EmployeeHomeAddr();
		IEmployeeAddress empOfficeAddress = new EmployeeOfficeAddr();
//		empAddress.setStreet("gandhi");
//		empAddress.setCity("Vijayawada");
//		empAddress.setState("AP");
//		empAddress.setCountry("INDIA");
//		empAddress.setPinCode(521181);
		emp.seteAddress(empOfficeAddress);
		
		//EmployeeAddress eAddress = emp.geteAddress();
		//System.out.println(emp.geteAddress().getCity());

	}

}
