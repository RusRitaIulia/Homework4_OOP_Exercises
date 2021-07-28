package exercise4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Popescu", "Gicu", 10000.0);
        Employee employee2 = new Employee("Constantinescu", "Mirela", 3000.0);
        System.out.printf("Yearly salary of %s %s: %.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("Yearly salary of %s %s: %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        System.out.println();

        System.out.println("After 10% raise: ");
        System.out.printf("Yearly salary of %s %s: %.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getRaiseSalary());
        System.out.printf("Yearly salary of %s %s: %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getRaiseSalary());
    }
}
