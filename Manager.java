package lab5.Task4;

import java.time.LocalDate;

public class Manager extends Employee implements PerformanceIndicatorInterface {
    private Integer numberOfSubordinates;

    public Manager() {

    }

    public Manager(Integer id, String name, Double salary, Double salaryBonus, Double performanceIndicator, LocalDate dateOfEmployment, Integer numberOfSubordinates) {
        super(id, name, salary, salaryBonus, dateOfEmployment);
        this.numberOfSubordinates = numberOfSubordinates;
        setPerformanceIndicator(performanceIndicator);
    }

    public Integer getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(Integer numberOfSubordinates) {
        if (numberOfSubordinates > 0)
            this.numberOfSubordinates = numberOfSubordinates;
        else {
            System.out.println("Invalid number of subordinates");
            System.exit(1);
        }
    }

    @Override
    public void calcPerformanceIndicator() {
        setPerformanceIndicator(getPerformanceIndicator() * PerformanceIndicator.MANAGER_PI.getValue());
    }
}
