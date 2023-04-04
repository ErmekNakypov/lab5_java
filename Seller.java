package lab5.Task4;

import java.time.LocalDate;

public class Seller extends Employee implements PerformanceIndicatorInterface {
    private String sellingCountry;

    public Seller() {

    }

    public Seller(Integer id, String name, Double salary, Double salaryBonus, Double performanceIndicator, LocalDate dateOfEmployment, String sellingCountry) {
        super(id, name, salary, salaryBonus, dateOfEmployment);
        this.sellingCountry = sellingCountry;
        setPerformanceIndicator(performanceIndicator);
    }

    public String getSellingCountry() {
        return sellingCountry;
    }

    public void setSellingCountry(String sellingCountry) {
        if (!sellingCountry.isEmpty())
            this.sellingCountry = sellingCountry;
        else {
            System.out.println("Invalid selling country");
            System.exit(1);
        }
    }

    @Override
    public void calcPerformanceIndicator() {
        setPerformanceIndicator(getPerformanceIndicator() * PerformanceIndicator.SELLER.getValue());
    }
}
