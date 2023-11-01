public class DateTest {
    public static void main(String[] args) {

        Date date = new Date(10, 31, 2023);


        System.out.print("Date: ");
        date.displayDate();


        date.setMonth(12);
        date.setDay(25);
        date.setYear(2024);


        System.out.print("Updated Date: ");
        date.displayDate();
    }
}