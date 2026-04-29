package com.java.Employee;

public class EmployeeApplication {
    public static void main(String[] args){
        EmployeeService empservice = new EmployeeService();
        int numofEmp = 2;
        Employee[] emps = empservice.getEmps(numofEmp);
        System.out.println("=========================== # Employee List # ===========================");
        empservice.print(emps);
        int count = empservice.countempbyGender(emps, Gender.FEMALE);
        System.out.println("Count Female: " + count);
        System.out.println("\n# Calculation Bonus for Employee.");
        empservice.printBonus(emps);
        System.out.println("\n# Calculate Salary + Bonus for Employee.");
        empservice.printSalary(emps);
        System.out.println("\n# Calculate all Employee Salary.");
        double payment = empservice.sumempPayment(emps);
        System.out.println("Summary payment: $" + payment);
        
        
       
        /*EmployeeService empservice = new EmployeeService();

        Employee emp1 = new Employee("Vanda", Gender.MALE, 800, Kind.FULL_TIME);
        Employee emp2 = new Employee("Seyha", Gender.MALE, 700, Kind.FULL_TIME);
        Employee emp3 = new Employee("Tola", Gender.MALE, 250, Kind.PART_TIME);
        Employee emp4 = new Employee("Nika", Gender.FEMALE, 300, Kind.INTERNSHIP);
        Employee emp5 = new Employee("Lysa", Gender.FEMALE, 280, Kind.PART_TIME);

        Employee[] emps = new Employee[] {emp1, emp2, emp3, emp4, emp5};
        System.out.println("===================================== # Employee List # =====================================");
        for(int i=0; i<emps.length; i++){
            System.out.println(emps[i].toStr());
        }

        System.out.println("Count created object: " + Employee.count);

        int emp = empservice.countempbyGender(emps, Gender.FEMALE);
        System.out.println("Count female gender= " + emp);

        double bonusEmp1 = empservice.calculateBonus(emp1);
        System.out.println("Bonus for Employee = $" + bonusEmp1);
        
        double salaryEmp1 = empservice.calculateSalary(emp1);
        System.out.println("Salary + Bonus for Employee = $" + salaryEmp1);

        double sumPayment = empservice.sumempPayment(emps);
        System.out.println("Total Salary Payment for 5 Employees: $" + sumPayment);*/
    }
}
