import java.util.Scanner;

public class Days {

    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1-7):");
        int dayNumber = in.nextInt();

        Weekday[] days = Weekday.values();
        if (dayNumber >= 1 && dayNumber <= days.length) {
            Weekday chosenDay = days[dayNumber - 1];

            switch (chosenDay) {
                case MONDAY:
                    System.out.println("Monday");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday");
                    break;
                case FRIDAY:
                    System.out.println("Friday");
                    break;
                case SATURDAY:
                    System.out.println("Saturday");
                    break;
                case SUNDAY:
                    System.out.println("Sunday");
                    break;
            }
        } else {
            System.out.println("Invalid day number.");
        }
    }
}
