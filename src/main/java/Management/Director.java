package Management;

public class Director extends Management.Manager {

    private double budget;

    public Director(String name, String niNumber, int salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public double payBonus(){
        return this.getSalary() * 0.02;
    }
}
