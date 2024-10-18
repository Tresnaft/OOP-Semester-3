import java.util.Scanner;
public class WeeklySales {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        SalesPerson []  salesStaff = new SalesPerson[10];

//        salesStaff[0] = new SalesPerson("Jane", "Jones", 3000);
//        salesStaff[1] = new SalesPerson("Daffy", "Duck", 4935);
//        salesStaff[2] = new SalesPerson("James", "Jones", 3000);
//        salesStaff[3] = new SalesPerson("Dick", "Walter", 2800);
//        salesStaff[4] = new SalesPerson("Don", "Trump", 1570);
//        salesStaff[5] = new SalesPerson("Jane", "Black", 3000);
//        salesStaff[6] = new SalesPerson("Harry", "Taylor", 7300);
//        salesStaff[7] = new SalesPerson("Andy", "Adams", 5000);
//        salesStaff[8] = new SalesPerson("Jim", "Doe", 2850);
//        salesStaff[9] = new SalesPerson("Walt", "Smith", 3000);

        String firstName, lastName;
        int totalSales;
        System.out.println("How many sales staff?");
        int size = input.nextInt();
        SalesPerson []  salesStaff = new SalesPerson[size];

        for (int i = 0; i < salesStaff.length; i++){
            System.out.println("Input first name: ");
            firstName = input.next();
            System.out.println("Input last name: ");
            lastName = input.next();
            System.out.println("Input total sales: ");
            totalSales = input.nextInt();
            salesStaff[i] = new SalesPerson(firstName, lastName, totalSales);
        }

        Sorting.selectionSort(salesStaff);
//        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the Week\n");
        for (SalesPerson s : salesStaff)
            System.out.println(s);
    }
}
