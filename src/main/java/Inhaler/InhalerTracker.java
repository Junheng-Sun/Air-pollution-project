package Inhaler;

import java.util.Scanner;

public class InhalerTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsageService usageService = new UsageService();

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n=== Inhaler Usage Tracker ===");
            System.out.println("1. Record reliever inhaler use");
            System.out.println("2. View usage history");
            System.out.println("3. Show number of uses today");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); //Clear the leftover newline.

            if (choice == 1) {

                System.out.print("Enter a note or reason for use:");
                String note=scanner.nextLine();

                usageService.recordUse(note);
                System.out.println("Use recorded");

            } else if (choice == 2) {
                System.out.println("\nNumber of recorded uses: " + usageService.getNumberOfUses());

                for (UsageRecord record : usageService.getRecords()) {
                    System.out.println("Time: " + record.getTimeUsed());
                    System.out.println("Note:" + record.getNote());
                }

            } else if (choice == 3) {
                int usesToday = usageService.getNumberOfUsesToday();
                System.out.println("Number of uses today: " + usesToday);

            } else if (choice == 4) {
                System.out.println("Goodbye.");

            } else {
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
