package com.logicBuildingAlongWithAbstract;

public class TemporaryEmp extends Employee{

	int paid_leave;
	int sick_leave;
	int casual_leave;
	double basic;
	double hra;
	double pfa;
	
	
	@Override
	void calaculate_balance_leaves() {																					//Overidding the parent abstract method
		// TODO Auto-generated method stub									
		 paid_leave=super.total_leaves/3;
		 casual_leave=super.total_leaves/3;
		 sick_leave=super.total_leaves/3;
		
		
	}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {															//Overidding the parent abstract method
		// TODO Auto-generated method stub
		
		
		 	calaculate_balance_leaves();				//Calling the method inside the method to initialise the number of leaves
			
			if(no_of_leaves<paid_leave && type_of_leave=='P'){
				paid_leave=paid_leave-no_of_leaves;
				return true;
			}
			else if(no_of_leaves<sick_leave && type_of_leave=='S'){
				sick_leave=sick_leave-no_of_leaves;
				return true;
			}
			else if(no_of_leaves<casual_leave && type_of_leave=='C'){
				casual_leave=sick_leave-no_of_leaves;
				return true;
			}
			else {
				return false;
			}
			
		
	}
	@Override
	void calculate_salary() {				//Overriding the parent class method
		// TODO Auto-generated method stub
		
		System.out.println("Name of the employee "+super.empName);
		System.out.println("Employee ID of the employee "+super.empId);
		basic=super.total_salary;
		this.pfa=0.12*this.basic;
		this.hra=0.50*this.basic;
		
	super.total_salary=this.basic+this.pfa+this.hra;
	System.out.println("The total salary of a temporary employee is "+super.total_salary);
	}
	
	
}
