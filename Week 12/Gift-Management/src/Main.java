import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Family Menu ===");
            System.out.println("1. Add Niece");
            System.out.println("2. Add Uncle");
            System.out.println("3. Find Niece");
            System.out.println("4. Find Uncle");
            System.out.println("5. List Nieces");
            System.out.println("6. List Uncles");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Niece's name: ");
                    String nieceName = scanner.nextLine();
                    System.out.print("Enter birth day: ");
                    int day = scanner.nextInt();
                    System.out.print("Enter birth month: ");
                    int month = scanner.nextInt();
                    if (family.addNiece(nieceName, day, month)) {
                        System.out.println("Niece added successfully.");
                    } else {
                        System.out.println("Niece already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Uncle's name: ");
                    String uncleName = scanner.nextLine();
                    if (family.addUncle(uncleName)) {
                        System.out.println("Uncle added successfully.");
                    } else {
                        System.out.println("Uncle already exists.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Niece's name to find: ");
                    nieceName = scanner.nextLine();
                    Niece niece = family.findNiece(nieceName);
                    if (niece != null) {
                        System.out.println("Found: " + niece);
                    } else {
                        System.out.println("Niece not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Uncle's name to find: ");
                    uncleName = scanner.nextLine();
                    Uncle uncle = family.findUncle(uncleName);
                    if (uncle != null) {
                        System.out.println("Found: " + uncle);
                    } else {
                        System.out.println("Uncle not found.");
                    }
                    break;

                case 5:
                    System.out.println("Listing all Nieces:");
                    family.listNieces();
                    break;

                case 6:
                    System.out.println("Listing all Uncles:");
                    family.listUncle();
                    break;

                case 7:
                    System.out.println("Add Present");
                    uncleName = scanner.nextLine();
                    if
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
