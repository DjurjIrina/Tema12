package employee;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Marius", 25, "saten", "Endava", 5000);
        Employee e2 = new Employee("Maria", 34, "blonda", "Cognizant", 10000);
        Employee e3 = new Employee("Cristi", 44, "saten", "Arobs", 6000);
        Employee e4 = new Employee("Cristina", 25, "satena", "Arobs", 7000);
        Employee e5 = new Employee("Marcel", 33, "saten", "NTT", 12000);
        Employee e6 = new Employee("Marina", 32, "bruneta", "Fortech", 7500);
        Employee e7 = new Employee("Marcel", "Arobs", 10000);

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(e1);
        allEmployees.add(e2);
        allEmployees.add(e3);
        allEmployees.add(e4);
        allEmployees.add(e5);
        allEmployees.add(e6);
        allEmployees.add(e7);

        System.out.println(allEmployees);


        System.out.println(EmployeeService.employeesWhoEarnMore(allEmployees,10000));
        System.out.println(EmployeeService.mapEmployeesByCompany(allEmployees));
        System.out.println(EmployeeService.getSalarySum(allEmployees));


        System.out.println(EmployeeService.getBestSalary(allEmployees));

    }
}