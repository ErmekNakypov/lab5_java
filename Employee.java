package lab5.Task4;

import java.time.LocalDate;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Double salaryBonus;
    private Double performanceIndicator;
    private LocalDate dateOfEmployment;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary, Double salaryBonus, LocalDate dateOfEmployment) {
        setId(id);
        setName(name);
        setSalary(salary);
        setSalaryBonus(salaryBonus);
        setDateOfEmployment(dateOfEmployment);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id > 0)
            this.id = id;
        else {
            System.out.println("Invalid id");
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else {
            System.out.println("Invalid name");
            System.exit(1);
        }
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0)
            this.salary = salary;
        else {
            System.out.println("Invalid salary");
            System.exit(1);
        }
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(Double salaryBonus) {
        if (salaryBonus > 0) {
            this.salaryBonus = salaryBonus;
            salary += salaryBonus;
        } else {
            System.out.println("Invalid salary");
            System.exit(1);
        }
    }

    public Double getPerformanceIndicator() {
        return performanceIndicator;
    }

    public void setPerformanceIndicator(Double pi) {
        if (pi > 0)
            this.performanceIndicator = pi;
        else {
            System.out.println("Invalid performance indicator");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryBonus=" + salaryBonus +
                ", performanceIndicator=" + performanceIndicator +
                ", dateOfEmployment=" + dateOfEmployment;
    }
}
