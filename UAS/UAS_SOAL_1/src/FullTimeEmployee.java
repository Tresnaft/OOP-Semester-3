public class FullTimeEmployee<T> extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(T id, String name, double monthlySalary){
        super(id,name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment(){
        return this.monthlySalary;
    }
}
