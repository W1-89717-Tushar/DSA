package classwork;

import java.util.Arrays;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Employee() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class EmployeeSort {
	
	
	public static void sortBySalary(Employee arr[],int n,Employee r) {
		for(int k =0 ; k<n ; k++) {
			for(int i = 0;i<n-1-k;i++) {
				if(arr[i].getSalary() > arr[i+1].getSalary()) {
					r = arr[i];
					arr[i] =arr[i+1];
					arr[i+1] = r;
				}
			}
		}
	}
	
	
	public static void main(String args[]) {
		Employee r = new Employee();
		Employee e = new Employee(1,"Tushar",40000);
		Employee e1 = new Employee(2,"Aashish",50000);
		Employee e2 = new Employee(3,"Shubham",3000);
		Employee e3 = new Employee(4,"Lakhan",10000);
		
		Employee arr[] = {e,e1,e2,e3};
		
		System.out.println("before sorting " + Arrays.toString(arr));
		sortBySalary(arr, arr.length,r);
		System.out.println("after sorting " + Arrays.toString(arr));
	}

}
