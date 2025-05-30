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


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
}

public class IdEmp {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee(1,"Tushar");
		Employee e1 = new Employee(2,"Aashish");
		
		Employee arr[] = {e,e1};
		boolean flag = false;
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Search by id:");
			System.out.println("2. search by name: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: System.out.println("enter id to be searched: ");
					int id = sc.nextInt();
					for(int i = 0; i<arr.length ;i++) {
						if(arr[i].getEmpid() == id) {
							flag = true;
							System.out.println(arr[i].toString());
						}
					}
					if(flag = false)
						System.out.println("no Employee found");
					break;
			case 2: System.out.println("enter name to be searched: ");
					String name = sc.next();
					for(int i =0 ; i<arr.length;i++) {
						flag = true;
						if(arr[i].getName().equalsIgnoreCase(name)) {
							System.out.println(arr[i].toString());
						}
					}
					if(flag = false)
						System.out.println("no Employee found");
					break;
			case 0: System.out.println("bye");
			
			}
		}while(choice != 0);

	}

}
