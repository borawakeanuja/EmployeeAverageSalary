# EmployeeAverageSalary
Background:
Application has Employee class details with it such as First name, Last name, Salary, Department, Designation, OfficeLocation etc.
Write a logic for given list of employees to find out average salary in each OfficeLocation for all common Designation. Also, try to demonstrate parallel processing for each OfficeLocation.
Sample Input :
	/* Sample input for employees list as:
		List<Employee> employees = new ArrayList<>();
			employees.add(new Employee("Ashish", "A", "IT", "Pune", "Software Engineer", new Double(10000));
			employees.add(new Employee("Amit", "R", "HR", "Pune", "Recruiter", new Double(12000)));
			employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter", new Double(14000)));
			employees.add(new Employee("Jaya", "S", "IT", "Pune", "Tech Lead", new Double(15000)));
			employees.add(new Employee("Smita", "M", "IT", "Bangalore", "Recruiter", new Double(16000)));
			employees.add(new Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer", new Double(12000));
			employees.add(new Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer", new Double(12000)));
			employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Recruiter", new Double(16000)));
			employees.add(new Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead", new Double(20000)));
			employees.add(new Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer", new Double(14000)));
		*/
		
		
Sample output for given input is:

Pune --> Software Engineer --> 10000
Pune --> Tech Lead --> 15000
Pune --> Recruiter --> 14000
Pune --> Senior Recruiter --> 14000
Bangalore --> Software Engineer --> 12666.67
Bangalore --> Tech Lead --> 20000
Bangalore --> Recruiter --> 16000

class Employee{
private String firstName;
private String lastName;
private String department;
private String officeLocation;
private String designation;
private Double salary;

public Employee(String firstName, String lastName, String department, String officeLocation, String designation, Double salary){
this.firstName= firstName;
this.lastName = lastName;
this.department = department;
this.officeLocation = ;
this.designation = designation;
this.salary = salary;
}
}


class FindAverageSalaryApp{

public void findAverageSalary(List<Employee> employees){

//Write your logic here

}

}

class SampleApp{

public static void main(String[] args){


		List<Employee> employees = new ArrayList<>();
		/* Sample input for employees list as:
			employees.add(new Employee("Ashish", "A", "IT", "Pune", "Software Engineer", new Double(10000));
			employees.add(new Employee("Amit", "R", "HR", "Pune", "Recruiter", new Double(12000)));
			employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Senior Recruiter", new Double(14000)));
			employees.add(new Employee("Jaya", "S", "IT", "Pune", "Tech Lead", new Double(15000)));
			employees.add(new Employee("Smita", "M", "IT", "Bangalore", "Recruiter", new Double(16000)));
			employees.add(new Employee("Umesh", "A", "IT", "Bangalore", "Software Engineer", new Double(12000));
			employees.add(new Employee("Pooja", "R", "HR", "Bangalore", "Software Engineer", new Double(12000)));
			employees.add(new Employee("Ramesh", "D", "HR", "Pune", "Recruiter", new Double(16000)));
			employees.add(new Employee("Bobby", "S", "IT", "Bangalore", "Tech Lead", new Double(20000)));
			employees.add(new Employee("Vipul", "M", "IT", "Bangalore", "Software Engineer", new Double(14000)));
				
		
		*/
		FindAverageSalaryApp app = new FindAverageSalaryApp();
		app.findAverageSalary(employees);
	
}

}
Java-Code-Interview-Question.txt
Displaying Java-Code-Interview-Question.txt. 
