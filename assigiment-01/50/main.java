package assignments;

import java.util.Scanner;

//incomplete programme

class Employee
{
	int empId;
	String name;
	double salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee a=(Employee) obj;
		return  empId==a.empId;
	}

 class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[] =new Employee[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the EmpId ");
			int id=sc.nextInt();
			
			System.out.println("Enter the Name");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("Enter the Salary");
			double salary=sc.nextDouble();
			
			Employee e=new Employee(id,name,salary);
			
			
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==null)
				{
					continue;
				}
				else {
					boolean var=arr[j].equals(e);
					if(var!=true)
					{
						arr[i]=e;
						System.out.println("Exist");
					}
				}
			}
			
			
//			arr[i]=e;
			
			
//			if(arr[0]==null)
//			{
//				arr[i]=e;
//			}
//			else {
//			for(int j=0;j<arr.length;j++)
//			{
//				
//				if(e.equals(arr[j]))
//				{
//					System.out.println("already exist");
//					break;
//				}
//			}
//			
//			arr[i]=e;
//			}
		}
		
		for(Employee emp:arr) {
			System.out.println(emp.empId);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println("*****************************************");
		}
		
	}

}