package employee;

import person.Person;

public class Employee extends Person {
        private String company;
        private int salary;

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
    public Employee(String names,String company, int salary){
        this.names=names;
        this.company=company;
        this.salary=salary;
    }

    public Employee(String names, int age, String hairColor, String company, int salary) {
        super(names, age, hairColor);
        this.company = company;
        this.salary = salary;


    }

    @Override
    public String toString() {
        return company + "|" + salary;
    }
}

