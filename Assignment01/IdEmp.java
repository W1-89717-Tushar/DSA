package Assignment01;

import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	
	
	public Employee(int empid, String name) {
		
		this.empid = empid;
		this.name = name;
	}


	public Employee() {
		
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class IdEmp {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter numbers of employee: ");
		int n = sc.nextInt();
		Employee e = new Employee();
		
		for(int i =1;i<=n ;i++ ) {
			e.setEmpid(i);
			System.out.println("enter name for id " + i);
			String name = sc.next();
			e.setName(name);
		}

	}

}
