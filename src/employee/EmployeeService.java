package employee;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

    public static List<Employee> employeesWhoEarnMore(List<Employee> allEmployees, int specifiedAmount) {
        List<Employee> employeesWithBiggerSalary = new ArrayList<>();
        for (Employee currentEmployee : allEmployees) {
            String employeeName = currentEmployee.getNames();
            if (currentEmployee.getSalary() > specifiedAmount) {
                employeesWithBiggerSalary.add(currentEmployee);
            }
        }
        return employeesWithBiggerSalary;
    }

    public static Map<String, List<String>> mapEmployeesByCompany(List<Employee> allEmployees) {
        Map<String, List<String>> groupedEmployeesByCompany = new HashMap<>();

        for (Employee currentEmployee : allEmployees) {
            String myCompany = currentEmployee.getCompany();
            String myName = currentEmployee.getNames();

            if (!groupedEmployeesByCompany.containsKey(myCompany)) {
                List<String> listOfEmployee = new ArrayList<>();
                listOfEmployee.add(myName);
                groupedEmployeesByCompany.put(myCompany, listOfEmployee);
            } else {
                List<String> existingEmployees = groupedEmployeesByCompany.get(myCompany);
                existingEmployees.add(myName);
                groupedEmployeesByCompany.put(myCompany, existingEmployees);
            }
        }
        return groupedEmployeesByCompany;
    }

    public static int getSalarySum(List<Employee> allEmployees) {
        int sum = 0;
        for (Employee currentEmployee : allEmployees) {
            Integer mySum = currentEmployee.getSalary();
            sum += mySum;
        }
        return sum;
    }

    public static Employee getBestSalary(List<Employee> allEmployees) {
        int maxSalary = 0;
        Employee bestCompany = null;
        for (Employee currentEmployee : allEmployees) {
            Integer mySalary = currentEmployee.getSalary();
            if (currentEmployee.getSalary() > maxSalary) {
                maxSalary = currentEmployee.getSalary();
                bestCompany = currentEmployee;
            }
        }
        return bestCompany;
    }
}
