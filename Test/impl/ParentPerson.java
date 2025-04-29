package impl;

public class ParentPerson {
    private String name;
    private Double Healthy;
    public ParentPerson(String name, Double Healthy) {
        this.name = name;
        this.Healthy = Healthy;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getHealthy() {
        return Healthy;
    }

    public void setHealthy(Double healthy) {
        Healthy = healthy;
    }
}
