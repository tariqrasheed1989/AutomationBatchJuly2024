package CollectionsClass;

import java.util.HashMap;
import java.util.Map;

class Employee{
	
	int empID;
	String name;
	int salary;
	public Employee(int empID, String name, int salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}

public class Interview {
	
	Map<String,Employee> employeeData = new HashMap();
	public void addEmployee(Employee employee) {
		
		employeeData.put(employee.getName(),employee);
	}
	
	public Employee getEmployee(String name) {
		return employeeData.get(name);
	}
	
	public static void main(String[] args) {
	
		Interview interview = new Interview();
		interview.addEmployee(new Employee(1,"Tariq",100000));
		interview.addEmployee(new Employee(1,"Qirat",120000));
		interview.addEmployee(new Employee(1,"Rasheed",50000));		
		
		String searchName = "Qirat";
		Employee employee= interview.getEmployee(searchName);
		if(employee!=null) {
			System.out.println("ID: "+employee.getEmpID());
			System.out.println("Salary: "+employee.getSalary());
		}else {
			System.out.println(searchName+" not found");
		}
	}

}
