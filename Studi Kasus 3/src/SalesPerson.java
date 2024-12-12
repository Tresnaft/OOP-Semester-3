public class SalesPerson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other){
        return (lastName.equals(((SalesPerson)other).getLastName()) && firstName.equals(((SalesPerson)other).getFirstName()));
    }

    public int compareTo(Object other){
        int result;
        if (this.totalSales > ((SalesPerson)other).totalSales){
            result = 1;
        } else if (this.totalSales < ((SalesPerson)other).totalSales) {
            result = -1;
        } else {
            result = this.getLastName().concat(this.getFirstName()).compareToIgnoreCase(((SalesPerson)other).lastName.concat(((SalesPerson)other).getFirstName()));
        }
        return result;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSales(){
        return totalSales;
    }
}
