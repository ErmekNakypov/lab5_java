package lab5.Task4;

public enum PerformanceIndicator {
    MANAGER_PI(3.14),
    DEVELOPER_PI(8.77),
    SELLER(1.34);

    private Double value;

    PerformanceIndicator(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
