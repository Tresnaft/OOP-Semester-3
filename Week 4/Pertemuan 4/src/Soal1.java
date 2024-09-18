import com.polban.jtk.sales.Sales;
import com.polban.jtk.sales.Product;

public class Soal1 {
    public static void main(String[] args) {
        // 1. Buatlah objek dengan quantity produk 10
        Product product = new Product("Laptop", 100000, 10);

        // 3. Buatlah objek sales
        Sales sales = new Sales(product);

        // 4. Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 5. Lakukan restock produk
        sales.restockProduct(7);

        // 6. Lakukan memperbaharui harga produk
        sales.updateProductPrice(500000000);

        // 7. Coba lakukan memperbaharui harga produk dengan nilai negative
        sales.updateProductPrice(-300000);

    }
}
