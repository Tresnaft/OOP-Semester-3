import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AplikasiPemesananMakanan {
    private JPanel panel1;
    private JCheckBox steakCheckBox;
    private JCheckBox spaghettiCheckBox;
    private JCheckBox pizzaCheckBox;
    private JTextField textField1;
    private JButton TAMBAHButton;
    private JTextArea textArea1;
    private JTextField alamatField;
    private JTextField telpField;
    private JTextField namaField;

    public AplikasiPemesananMakanan() {
        // Tambahkan ItemListener ke setiap checkbox
        steakCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateTotalHarga();
            }
        });

        spaghettiCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateTotalHarga();
            }
        });

        pizzaCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateTotalHarga();
            }
        });

        // Action Listener untuk tombol TAMBAH
        TAMBAHButton.addActionListener(e -> tambahPesanan());
    }

    private void updateTotalHarga() {
        int totalHarga = 0;

        // Periksa setiap checkbox dan tambahkan harga jika dipilih
        if (steakCheckBox.isSelected()) {
            totalHarga += 50000;
        }
        if (spaghettiCheckBox.isSelected()) {
            totalHarga += 40000;
        }
        if (pizzaCheckBox.isSelected()) {
            totalHarga += 80000;
        }

        // Tampilkan total harga di textField1
        textField1.setText("Rp. " + totalHarga);
    }

    private void tambahPesanan() {
        // Mendapatkan data input dari text field untuk customer
        String nama = namaField.getText();
        String alamat = alamatField.getText();
        String noTelp = telpField.getText();

        // Mendapatkan data pesanan dari checkbox
        String pesanan = "";
        int totalHarga = 0;

        if (steakCheckBox.isSelected()) {
            pesanan += "- Steak (Rp. 50,000)\n";
            totalHarga += 50000;
        }
        if (spaghettiCheckBox.isSelected()) {
            pesanan += "- Spaghetti (Rp. 40,000)\n";
            totalHarga += 40000;
        }
        if (pizzaCheckBox.isSelected()) {
            pesanan += "- Pizza (Rp. 80,000)\n";
            totalHarga += 80000;
        }

        if (pesanan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Silakan pilih minimal satu pesanan!");
            return;
        }

        // Format data untuk ditampilkan di textArea
        String output = "------------------------\n" +
                "Nama : " + nama + "\n" +
                "Alamat : " + alamat + "\n" +
                "Telp : " + noTelp + "\n" +
                "------------------------\n" +
                "Pesanan:\n" + pesanan +
                "------------------------\n" +
                "Total Bayar: Rp. " + totalHarga + "\n";

        // Menambahkan data ke textArea (agar tidak menimpa, gunakan append)
        textArea1.append(output + "\n");

        // Reset checkbox setelah menambah pesanan
        steakCheckBox.setSelected(false);
        spaghettiCheckBox.setSelected(false);
        pizzaCheckBox.setSelected(false);

        // Reset textField
        namaField.setText("");
        alamatField.setText("");
        telpField.setText("");
        textField1.setText("");
    }

    public static void main(String[] args) {
        // Membuat JFrame untuk aplikasi
        JFrame frame = new JFrame("Aplikasi Pemesanan Makanan");
        frame.setContentPane(new AplikasiPemesananMakanan().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
