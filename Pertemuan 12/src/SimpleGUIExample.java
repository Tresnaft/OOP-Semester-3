import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIExample extends JFrame {

    public SimpleGUIExample() {
        // Set judul jendela
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Membuat komponen GUI
        JLabel label = new JLabel("Masukkan nama Anda:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Klik Saya");
        JLabel resultLabel = new JLabel("");

        // Menambahkan action listener ke tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                resultLabel.setText("POLBAN!, " + name + "!");
            }
        });

        // Menyusun komponen ke dalam panel
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        // Menambahkan panel ke jendela
        add(panel);
    }

    public static void main(String[] args) {
        // Menjalankan GUI di Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            SimpleGUIExample example = new SimpleGUIExample();
            example.setVisible(true);
        });
    }
}
