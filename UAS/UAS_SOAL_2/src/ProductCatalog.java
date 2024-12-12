import java.util.HashMap;
import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        //Deklarasi Hashmap
        HashMap<String, Double> productCatalog = new HashMap<>();
        // Masukkan data produk ke dalam HashMap
        productCatalog.put("Buku", 5000.0);
        productCatalog.put("Pensil", 3000.0);
        productCatalog.put("Penghapus", 1000.0);
        productCatalog.put("Penggaris", 2000.0);
        productCatalog.put("Tas", 50000.0);

        // Menampilkan Katalog Produk
        System.out.printf("Katalog Produk: \n");
        System.out.printf("Barang\t|\tHarga:\n");
        for (String barang : productCatalog.keySet()){
            System.out.printf(barang + "\t\t" + "Rp." + productCatalog.get(barang) + "\n");
        }

        //Mencari harga produk berdasarkan nama
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama produk yang ingin dicari: ");
        String productName = scanner.nextLine();
        productName = productName.substring(0,1).toUpperCase() + productName.substring(1);

        if (productCatalog.containsKey(productName)){
            System.out.println("Harga " + productName + ": " + productCatalog.get(productName));
        } else {
            System.out.println(productName + " tidak ditemukan.");
        }
    }
}
