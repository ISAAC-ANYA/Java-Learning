import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private double height; 
    private double weight; 

    public HealthProfile(String firstName, String lastName, String gender, Date dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public int calculateAge() {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    public String calculateTargetHeartRateRange() {
        int maxHeartRate = calculateMaxHeartRate();
        int lowerRange = (int) (0.5 * maxHeartRate);
        int upperRange = (int) (0.85 * maxHeartRate);
        return lowerRange + " - " + upperRange;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGender: " + gender +
                "\nDate of Birth: " + dateOfBirth +
                "\nHeight: " + height + " meters" +
                "\nWeight: " + weight + " kilograms" +
                "\nAge: " + calculateAge() + " years" +
                "\nBMI: " + calculateBMI() +
                "\nMax Heart Rate: " + calculateMaxHeartRate() +
                "\nTarget Heart Rate Range: " + calculateTargetHeartRateRange();
    }
}

public class HealthProfileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dobString = scanner.nextLine();
        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();
        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();


        Date dateOfBirth = java.sql.Date.valueOf(dobString);

        HealthProfile healthProfile = new HealthProfile(firstName, lastName, gender, dateOfBirth, height, weight);

        System.out.println("\nHealth Profile Information:");
        System.out.println(healthProfile);

        scanner.close();
    }
}