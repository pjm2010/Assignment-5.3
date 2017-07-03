package com.logicBuildingAlongWithAbstract;
/*The abstract class has set the methods to be used in the child class which will inherit the same*/
public abstract class Employee {

//Properties of the abstract class
	int empId=0;
	String empName=null;
	int total_leaves;
	double total_salary;
	
//Abstract class method	
	 abstract void calaculate_balance_leaves();
	 abstract boolean avail_leave(int no_of_leaves,char type_of_leave);
	 abstract void calculate_salary();
	 
	 
	
	}
