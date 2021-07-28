package exercise4;

public class Employee {
    private String firstName, lastName;
    private double employeeMonthlySalary;

    public Employee(String firstName, String lastName, double employeeMonthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeMonthlySalary = employeeMonthlySalary;
        if (!(employeeMonthlySalary > 0.0))
            this.employeeMonthlySalary = 0.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double employeeMonthlySalary) {
        this.employeeMonthlySalary = employeeMonthlySalary;
    }

    public double getMonthlySalary() {
        return employeeMonthlySalary;
    }

    public double getYearlySalary() {
        double yearlySalary = employeeMonthlySalary * 12;
        return yearlySalary;
    }

    public double getRaiseSalary() {
        double raise = employeeMonthlySalary * 0.1;
        double raiseSalary = (employeeMonthlySalary + raise) * 12;
        return raiseSalary;
    }
}
