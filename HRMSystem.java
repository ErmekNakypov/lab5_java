package lab5.Task4;

import java.util.ArrayList;

public class HRMSystem {
    private ArrayList<Employee> employees;

    public HRMSystem() {
        employees = new ArrayList<>();
    }

    public HRMSystem(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        if (employee != null)
            this.employees.add(employee);
        else {
            System.out.println("Invalid employee");
            System.exit(1);
        }
    }

    public void deleteById(int id) {
        this.employees.remove(getElementIndex(id));
    }

    public void editEmployee(Employee employee, int id) {
        if (employee != null)
            this.employees.set(getElementIndex(id), employee);
    }

    private int getElementIndex(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return this.employees.indexOf(employee);
        }
        System.out.printf("Employee with %d id does not exist", id);
        System.exit(1);
        return 1;
    }

    public void listOfEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : employees)
            System.out.println(employee);
    }

    public void salaryDeveloper() {
        System.out.println("Salary info of developers: ");
        for (Employee employee : employees) {
            if (employee.getClass().getSimpleName().equals(Developer.class.getSimpleName())) {
                System.out.print(employee.getId() + " ");
                System.out.print(employee.getName() + " ");
                System.out.print(employee.getSalary() - employee.getSalaryBonus() + " ");
                System.out.println(employee.getSalaryBonus());
            }
        }
    }

    public void salarySeller() {
        System.out.println("Salary info of sellers: ");
        for (Employee employee : employees) {
            if (employee.getClass().getSimpleName().equals(Seller.class.getSimpleName())) {
                System.out.print(employee.getId() + " ");
                System.out.print(employee.getName() + " ");
                System.out.print(employee.getSalary() - employee.getSalaryBonus() + " ");
                System.out.println(employee.getSalaryBonus());
            }
        }
    }

    public void salaryManager() {
        System.out.println("Salary info of managers: ");
        for (Employee employee : employees) {
            if (employee.getClass().getSimpleName().equals(Manager.class.getSimpleName())) {
                System.out.print(employee.getId() + " ");
                System.out.print(employee.getName() + " ");
                System.out.print(employee.getSalary() - employee.getSalaryBonus() + " ");
                System.out.println(employee.getSalaryBonus());
            }
        }
    }

    public void performanceInfo() {
        System.out.println("Performance info of employees: ");
        for (Employee employee : employees) {
            System.out.print(employee.getId() + " ");
            System.out.print(employee.getName() + " ");
            System.out.println(employee.getPerformanceIndicator());
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
