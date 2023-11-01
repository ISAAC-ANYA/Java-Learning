import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
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

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public int calculateAge(int currentYear) {
        return currentYear - birthYear;
    }


    public int calculateMaxHeartRate() {
        return 220 - calculateAge(2023); // Using 2023 as the current year
    }


    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        double lowerBound = maxHeartRate * 0.5;
        double upperBound = maxHeartRate * 0.85;
        return (int) lowerBound + " - " + (int) upperBound;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Birth Month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter Birth Day: ");
        int birthDay = scanner.nextInt();
        System.out.print("Enter Birth Year: ");
        int birthYear = scanner.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);


        int currentYear = 2023; // Using 2023 as the current year
        int age = person.calculateAge(currentYear);
        int maxHeartRate = person.calculateMaxHeartRate();
        String targetHeartRate = person.calculateTargetHeartRate();


        System.out.println("\nPerson's Information:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + age + " years");
        System.out.println("Max Heart Rate: " + maxHeartRate);
        System.out.println("Target Heart Rate Range: " + targetHeartRate);

        scanner.close();
    }
}