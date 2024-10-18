import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Delivery[] delivery = null;
        try {
            delivery = gson.fromJson(new FileReader("D:\\Tresh\\Polban\\Semester 3\\OOP\\OOP-Semester-3\\ETS\\2B_Tresnardi Fathu Rhamdan_ETS_pbo_2024\\src\\Output.json"), Delivery[].class);
        } catch (IOException e) {
            e.printStackTrace();
            // handle exception correctly.
        }

        if (delivery != null) {
            System.out.printf("%-22s %-3s %-5s %-3s %-5s %-3s %-10s %-3s %-15s %-3s %-10s %-3s %-10s %-3s %-17s %-3s %-10s \n",
                    "productName", "|", "quantity", "|", "weight", "|",
                    "destination", "|", "servicePackage", "|", "serviceValue", "|",
                    "Total", "|", "paymentMethod", "|", "paymentStatus");
            for (Delivery data : delivery) {
                System.out.printf("%-22s %-3s %-8s %-3s %-6s %-3s %-11s %-3s %-15s %-3s %-12s %-3s %-10s %-3s %-10s %-3s %-10s \n",
                        data.getProductName(), "|", data.getQuantity(), "|",
                        data.getWeight(), "|", data.getCity().getDestination(), "|",
                        data.getServicePackage().getService(), "|", data.getServicePackage().getValue(),
                        "|", data.getTotal(), "|", data.getPaymentMethod(), "|", data.getPaymentStatus());
            }
        }
    }
}
