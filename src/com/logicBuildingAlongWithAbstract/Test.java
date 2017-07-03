package com.logicBuildingAlongWithAbstract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean grant=false;
		
		Employee emp=new PermamanentEmp();
		
		
		emp.empName="Walter Willy";		//Declaring the name of the permanenet employee
		emp.empId=1;		//Declaring all the attributes 
		emp.total_salary=900000.00;
		emp.calculate_salary();
		emp.total_leaves=15;
		emp.calaculate_balance_leaves();
		grant=emp.avail_leave(2,'C');
		if(grant==true){
		System.out.println("Granted ");
		}
		else{
			System.out.println("Not Granted");
		}
		

		System.out.println("*********************");
		
		Employee emp1=new TemporaryEmp();			//Declaring the name of the permanenet employee
		emp.empId=1;								//Declaring all the attributes
		
		emp1.empName="Vijay Yeligunta";
		emp1.empId=2;
		emp1.total_salary=400000.00;
		emp1.calculate_salary();
		emp1.total_leaves=15;
		emp1.calaculate_balance_leaves();
		grant=emp1.avail_leave(2,'C');
		if(grant==true){
		System.out.println("Granted ");
		}
		else{
			System.out.println("Not Granted");
	
	}
}

}
