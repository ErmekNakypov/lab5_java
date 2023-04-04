package lab5.Task4;

import java.time.LocalDate;

public class Developer extends Employee implements PerformanceIndicatorInterface {
    private String devLevel;
    private String itDepartment;

    public Developer() {

    }

    public Developer(Integer id, String name, Double salary, Double salaryBonus, Double performanceIndicator, LocalDate dateOfEmployment, String devLevel, String itDepartment) {
        super(id, name, salary, salaryBonus, dateOfEmployment);
        this.devLevel = devLevel;
        this.itDepartment = itDepartment;
        setPerformanceIndicator(performanceIndicator);
    }

    public String getDevLevel() {
        return devLevel;
    }

    public void setDevLevel(String devLevel) {
        if (!devLevel.isEmpty())
            this.devLevel = devLevel;
        else {
            System.out.println("Invalid dev level");
            System.exit(1);
        }
    }

    public String getItDepartment() {
        return itDepartment;
    }

    public void setItDepartment(String itDepartment) {
        if (!itDepartment.isEmpty())
            this.itDepartment = itDepartment;
        else {
            System.out.println("Invalid it department");
            System.exit(1);
        }
    }

    @Override
    public void calcPerformanceIndicator() {
        setPerformanceIndicator(getPerformanceIndicator() * PerformanceIndicator.DEVELOPER_PI.getValue());
    }
}
