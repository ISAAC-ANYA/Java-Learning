public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);


        System.out.println("Yearly salaries before raise:");
        displayYearlySalary(employee1);
        displayYearlySalary(employee2);


        employee1.applyRaise();
        employee2.applyRaise();


        System.out.println("\nYearly salaries after 10% raise:");
        displayYearlySalary(employee1);
        displayYearlySalary(employee2);
    }


    private static void displayYearlySalary(Employee employee) {
        System.out.printf("%s %s's yearly salary: $%.2f%n", employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());
    }
}