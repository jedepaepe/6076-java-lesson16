import java.util.Scanner;

public class EventTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nouvel événement");
            Event event = new Event();
            System.out.print("nom: ");
            event.setName(scanner.nextLine());
            System.out.print("description: ");
            event.setDescription(scanner.nextLine());
            System.out.println("année mois jour heure minute: ");
            event.setYear(scanner.nextInt());
            event.setMonth(scanner.nextInt());
            event.setDay(scanner.nextInt());
            event.setHour(scanner.nextInt());
            event.setMinute(scanner.nextInt());
            System.out.print("Evénement " +
                    event.getName() + " " +
                    event.getYear() + "-" +
                    event.getMonth() + "-" +
                    event.getDay() + " " +
                    event.getHour() + ":" +
                    event.getMinute());
            scanner.nextLine();
            System.out.println();
        }
    }
}
