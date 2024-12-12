public class EmployeeObserverExample {
    public static void main(String[] args) {
        //Buat Employee sebagai Subject
        Employee<String> employee = new Employee<>();

        // Buat Observer
        Observer<String> hrObserver = new EmployeeObserver<>("HR Department");
        Observer<String> managerObserver = new EmployeeObserver<>("Manager");

        // Daftarkan observer ke Employee
        employee.addObserver(hrObserver);
        employee.addObserver(managerObserver);

        // Ubah state (misalnya nama atau gaji karyawan dan lihat notifikasi
        employee.setState("Nama berubah menjadi Tresnardi");
        employee.setState("Gaji berubah menjadi 15000000");
    }
}
