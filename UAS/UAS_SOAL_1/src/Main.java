public class Main {
    public static void main(String[] args){
        Employee<Integer> ftemployee = new FullTimeEmployee<>(1001, "Alice", 10000000);
        Employee<String> ptemployee = new PartTimeEmployee<>("PT2025", "Bob", 50, 75_000);

        ftemployee.displayDetails();
        System.out.println("Payment: " + ftemployee.calculatePayment());

        ptemployee.displayDetails();
        System.out.println("Payment: " + ptemployee.calculatePayment());
    }
}
