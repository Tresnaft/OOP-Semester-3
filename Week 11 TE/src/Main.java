public class Main {
    public static void main(String[] args) {
        // Create a new Family
        Family family = new Family();

        // Add uncles
        System.out.println("Adding Uncles:");
        family.addUncle("Albert");
        family.addUncle("Bill");
        family.addUncle("Charlie");
        family.addUncle("David");

        // Add nieces
        System.out.println("\nAdding Nieces:");
        family.addNiece("Amy", 15, 5);      // Amy's birthday is May 15
        family.addNiece("Beatrice", 10, 3); // Beatrice's birthday is March 10
        family.addNiece("Claire", 25, 7);   // Claire's birthday is July 25
        family.addNiece("Emily", 5, 12);    // Emily's birthday is December 5

        // List all uncles in alphabetical order
        System.out.println("\nList of Uncles (Alphabetical Order):");
        family.listUncles();

        // List all nieces in order of their birthdays
        System.out.println("\nList of Nieces (By Birthday):");
        family.listNieces();

        // Find specific uncles and nieces
        Uncle uncleAlbert = family.findUncle("Albert");
        Uncle uncleBill = family.findUncle("Bill");
        Niece nieceAmy = family.findNiece("Amy");
        Niece nieceBeatrice = family.findNiece("Beatrice");

        // Add presents for Amy from different uncles
        if (uncleAlbert != null && nieceAmy != null) {
            System.out.println("\nAdding Presents for Amy:");
            uncleAlbert.addPresent(nieceAmy, "The Wonder of Computers");
            uncleBill.addPresent(nieceAmy, "Book on Space Exploration");
        }

        // Add presents for Beatrice
        if (uncleBill != null && nieceBeatrice != null) {
            System.out.println("\nAdding Presents for Beatrice:");
            uncleBill.addPresent(nieceBeatrice, "Science Experiment Kit");
        }

        // List presents each uncle is giving
        System.out.println("\nPresents from Uncles:");
        System.out.println("Uncle Albert's presents:");
        if (uncleAlbert != null) {
            uncleAlbert.listPresents();
        }
        System.out.println("\nUncle Bill's presents:");
        if (uncleBill != null) {
            uncleBill.listPresents();
        }

        // List presents each niece will receive
        System.out.println("\nPresents for Nieces:");
        System.out.println("Presents for Amy:");
        if (nieceAmy != null) {
            nieceAmy.listPresents();
        }
        System.out.println("\nPresents for Beatrice:");
        if (nieceBeatrice != null) {
            nieceBeatrice.listPresents();
        }

        // Clear presents after a birthday
        System.out.println("\nClearing Presents for Amy after her birthday:");
        if (nieceAmy != null) {
            int removedPresents = nieceAmy.clearPresents();
            System.out.println("Removed " + removedPresents + " presents for Amy.");
        }

        // List presents again to confirm clearing
        System.out.println("\nPresents for Amy after clearing:");
        if (nieceAmy != null) {
            nieceAmy.listPresents();
        }
    }
}
