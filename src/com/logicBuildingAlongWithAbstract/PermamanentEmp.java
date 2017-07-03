package com.logicBuildingAlongWithAbstract;
/*This class will defined the methods laid in the abstract class*/
public  class PermamanentEmp  extends Employee {	

	/*Properties of the child class*/
	int paid_leave;
	int sick_leave;
	int casual_leave;
	double basic;
	double hra;
	double pfa;
	void print_leave_details(){					//Defining the child class method
		
		System.out.println("The total number of paid leaves of a permanent employee  are "+paid_leave);
		System.out.println("The total number of sick leaves of a permanet employee  are "+sick_leave);
		System.out.println("The total number of casual leaves of a permanet employee are   "+casual_leave);
		
	};	

	
	@Override
	void calaculate_balance_leaves() {			//Overriding the parent abstract method 
		// TODO Auto-generated method stub
		 paid_leave=super.total_leaves/3;
		 casual_leave=super.total_leaves/3;
		 sick_leave=super.total_leaves/3;
		
		
		
	}

	@Override							
	boolean avail_leave(int no_of_leaves, char type_of_leave) {					//Overidding the parent abstract method
		// TODO Auto-generated method stub
		
		 print_leave_details();
		 calaculate_balance_leaves();
	
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
	void calculate_salary() {																			//Overidding the parent abstract method
		// TODO Auto-generated method stub
		System.out.println("Name of the employee "+super.empName);
		System.out.println("Employee ID of the employee "+super.empId);

		basic=super.total_salary;
		pfa=0.12*basic;
		hra=0.50*basic;
		
	super.total_salary=basic+pfa+hra;
	System.out.println("The total salary of a permanent employee is "+super.total_salary);
	}
	

	
	
}
