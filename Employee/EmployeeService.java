package com.java.Employee;

public class EmployeeService{

    public Employee createEmp(){
        String name = EmployeeUtil.getString("Please input name: ");
        Gender gender = EmployeeUtil.getenumGender("Please input gender: ");
        double salary = EmployeeUtil.getDouble("Please input salary: $");
        Kind kind = EmployeeUtil.getenumKind("Please input kind: ");
        Employee emp = new Employee(name, gender, salary, kind);
        return emp;
    }

    public Employee[] getEmps(int n){
        Employee[] emps = new Employee[n];
        for(int i=0; i<n; i++){
            emps[i] = createEmp();
        }
        return emps;
    }

    public void print(Employee[] emps){
        for(int i=0; i<emps.length; i++){
            System.out.println(emps[i].toStr());
        }
    }

    // Version 1
    /*public int countGenderEmp(Employee[] emps){
        int countFemale = 0;
        for(int i=0; i<emps.length; i++){
            if(emps[i].getGender().equals(Gender.FEMALE)){
                countFemale ++;
            }
        }
        return countFemale;
    }*/

    // Version 2
    public int countempbyGender(Employee[] emps, Gender gender){
        System.out.println("\n# Count Employee by Gender.");
        int countGender = 0;
        for(int i=0; i<emps.length; i++){
            if(emps[i].getGender().equals(gender)){
                countGender++;
            }
        }
        return countGender;
    }

    public double calculateBonus(Employee emp){
        double bonus = 0.0;
        switch (emp.getKind()){
        case FULL_TIME: bonus = emp.getSalary() * 0.05;break;
        case PART_TIME: bonus = emp.getSalary() * 0.03;break;
        case INTERNSHIP: bonus = emp.getSalary() * 0.02;break;
        } 
        return bonus;
    }

    public void getbonuseachEmployee(Employee[] emps){
        for(int i=0; i<emps.length; i++){
            double bonus = calculateBonus(emps[i]);
            System.out.println("[name: " + emps[i].getName() + ", bonus: $" + bonus + "]");
        }
    }

    public double calculateSalary(Employee emps){
        double salary = 0.0;
        salary = emps.getSalary() + calculateBonus(emps);
        return salary;
    }

    public void getbonusplusSalary(Employee[] emps){
        for(int i=0; i<emps.length; i++){
            double bonusandSalary = calculateSalary(emps[i]);
            System.out.println("[name: " + emps[i].getName() + ", salary + bonus: $" + bonusandSalary + "]");
        }
    }

    public double sumempPayment(Employee[] emps){
        double sumPayment = 0.0;
        for(int i=0; i<emps.length; i++){
            sumPayment += calculateSalary(emps[i]);
        }
        return sumPayment;
    }
}
