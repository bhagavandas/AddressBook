package com.bl.EmpWage;

public class EmployeeWage extends Main {
	static int total_emp_Wage = 0;

	public void EmpCheck() {
		double emp_check = Math.floor(Math.random() * 10) % 2;
		if (emp_check == IS_FULLTIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

	public void CalculateEmpWage() {

		double emp_check = Math.floor(Math.random() * 10) % 2;
		if (emp_check == IS_FULLTIME)
			emp_hrs = 8;
		else
			emp_hrs = 0;
		emp_wage = emp_hrs * RATE_PER_HOUR;
		System.out.println("Full time Employee Wage: " + emp_wage);
	}

	public void UC3() {

		double emp_check = Math.floor(Math.random() * 10) % 3;
		if (emp_check == IS_PARTTIME) {
			emp_hrs = 4;
			emp_wage = emp_hrs * RATE_PER_HOUR;
			System.out.println("Part time Employee Wage: " + emp_wage);
		} else if (emp_check == IS_FULLTIME) {
			emp_hrs = 8;
			emp_wage = emp_hrs * RATE_PER_HOUR;
			System.out.println("Full time Employee Wage: " + emp_wage);
		} else {
			emp_hrs = 0;
			emp_wage = emp_hrs * RATE_PER_HOUR;
			System.out.println("Employee Wage: " + emp_wage);
		}
	}

	public void UC4() {
		int emp_check = (int) Math.floor(Math.random() * 10) % 3;
		switch (emp_check) {
		case 1:
			emp_hrs = 4;
			break;
		case 2:
			emp_hrs = 8;
			break;
		default:
			emp_hrs = 0;
			break;
		}
		emp_wage = emp_hrs * RATE_PER_HOUR;
		System.out.println("Employee Wage: " + emp_wage);
	}

	public void UC5() {
		int total_emp_Wage = 0;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
			int emp_check = (int) Math.floor(Math.random() * 10) % 3;
			switch (emp_check) {
			case 1:
				emp_hrs = 4;
				break;
			case 2:
				emp_hrs = 8;
				break;
			default:
				emp_hrs = 0;
				break;
			}
			emp_wage = emp_hrs * RATE_PER_HOUR;
			total_emp_Wage = total_emp_Wage + emp_wage;
			System.out.println("Employee Wage: " + emp_wage);
		}
		System.out.println("Total employee Wage : " + total_emp_Wage);
	}

	public static void UC6(String Company_name,int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS, int RATE_PER_HOUR) {
		//System.out.println("Details of Amazon : ");
		int dailywage = 0;
		int total_emp_Wage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		//Company_name = "Amazon";
		//MAX_HRS_IN_MONTH = 100;
		//NUM_OF_WORKING_DAYS = 20;
		//RATE_PER_HOUR = 20;
		

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int emp_check = (int) Math.floor(Math.random() * 10) % 3;
			switch (emp_check) {
			case 1:
				emp_hrs = 4;
				break;
			case 2:
				emp_hrs = 8;
				break;
			default:
				emp_hrs = 0;
				break;
			}
			dailywage = emp_hrs * RATE_PER_HOUR;
			totalEmpHrs += emp_hrs;

			System.out.println("Days: " + totalWorkingDays + " " + "Hours: " + totalEmpHrs + " Wage is : " + dailywage);

			total_emp_Wage += dailywage;
		}
		System.out.println("Total Monthly Wage : " + total_emp_Wage);
		System.out.println("Company Name : " + Company_name);
		System.out.println("Rate per hour : " + RATE_PER_HOUR);

	}

	public void UC7() {

		total_emp_Wage = total_emp_Wage + emp_wage;
		System.out.println("Employee Wage: " + emp_wage);

		System.out.println("Total employee Wage : " + total_emp_Wage);

	}

}
