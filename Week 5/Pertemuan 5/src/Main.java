import com.polban.jtk.akademik.Dosen;
import com.polban.jtk.akademik.JadwalPerkuliahan;
import com.polban.jtk.akademik.Mahasiswa;
import com.polban.jtk.akademik.MataKuliah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Method untuk menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("\n=== MENU AKADEMIK ===");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Dosen");
        System.out.println("3. Tampilkan Jadwal Perkuliahan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void tampilkanDataMahasiswa(List<Mahasiswa> daftarMahasiswa) {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.printf("%-15s %-10s %-20s %-10s\n", "Nama", "NIM", "Prodi", "Kelas");
        System.out.println("-----------------------------------------------------------");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.printf("%-15s %-10s %-20s %-10s\n",
                    mahasiswa.getNama(), mahasiswa.getNim(),
                    mahasiswa.getProdi(), mahasiswa.getKelas());
        }
    }

    // Method untuk menampilkan data dosen dalam bentuk tabel
    public static void tampilkanDataDosen(List<Dosen> daftarDosen) {
        System.out.println("\n=== Data Dosen ===");
        System.out.printf("%-25s %-15s %-10s\n", "Nama", "Kode Dosen", "Jurusan");
        System.out.println("-----------------------------------------------------------");
        for (Dosen dosen : daftarDosen) {
            System.out.printf("%-25s %-15s %-20s \n",
                    dosen.getNama(), dosen.getKode_dosen(), dosen.getJurusan());
        }
    }

    // Method untuk menampilkan jadwal perkuliahan dalam bentuk tabel
    public static void tampilkanJadwal(List<JadwalPerkuliahan> jadwal) {
        System.out.println("\n=== Jadwal Perkuliahan ===");
        System.out.printf("%-10s %-15s %-20s %-55s %-15s\n", "Hari", "Waktu", "Ruangan", "Mata Kuliah", "Dosen");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for (JadwalPerkuliahan j : jadwal) {
            System.out.printf("%-10s %-15s %-20s %-55s %-15s\n",
                    j.getHari(), j.getWaktu(), j.getRuangan(),
                    j.getMataKuliah().getNamaMK(), j.getDosen().getNama());
        }
    }

    public static void main(String[] args) {
        // Data com.polban.jtk.akademik.Mahasiswa
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa("Andi", "2A", "240000001", "Teknik Komputer dan Informatika", "D3-Teknik Informatika"));
        daftarMahasiswa.add(new Mahasiswa("Budi", "2B", "240000002", "Teknik Komputer dan Informatika", "D3-Teknik Informatika"));
        daftarMahasiswa.add(new Mahasiswa("Citra", "2A", "240000003", "Sistem Informasi", "S1"));
        daftarMahasiswa.add(new Mahasiswa("Dedi", "2B", "240000004", "Sistem Informasi", "S1"));
        daftarMahasiswa.add(new Mahasiswa("Eka", "2A", "240000005", "Teknik Elektro", "D3-Elektronika"));
        daftarMahasiswa.add(new Mahasiswa("Fani", "2B", "240000006", "Teknik Elektro", "D3-Elektronika"));
        daftarMahasiswa.add(new Mahasiswa("Galih", "2A", "240000007", "Ilmu Komputer", "S1"));
        daftarMahasiswa.add(new Mahasiswa("Hani", "2B", "240000008", "Ilmu Komputer", "S1"));
        daftarMahasiswa.add(new Mahasiswa("Indah", "2A", "240000009", "Teknik Industri", "D3-Manajemen Industri"));
        daftarMahasiswa.add(new Mahasiswa("Joko", "2B", "240000010", "Teknik Industri", "D3-Manajemen Industri"));

        // Data com.polban.jtk.akademik.Dosen
        List<Dosen> daftarDosen = new ArrayList<>();
        daftarDosen.add(new Dosen("Yudi Widhiyasana", "Teknik Komputer dan Informatika", "KO013N"));    //0
        daftarDosen.add(new Dosen("Trisna Gelar A", "Teknik Komputer dan Informatika", "KO078N"));      //1
        daftarDosen.add(new Dosen("Santi Sundari", "Teknik Komputer dan Informatika", "KO009N"));       //2
        daftarDosen.add(new Dosen("Ade Hodijah", "Teknik Komputer dan Informatika", "KO060N"));         //3
        daftarDosen.add(new Dosen("Bambang Wisnuadhi", "Teknik Komputer dan Informatika", "KO003N"));   //4
        daftarDosen.add(new Dosen("Wendi Wirasta", "Teknik Komputer dan Informatika", "KO079N"));       //5
        daftarDosen.add(new Dosen("Didik Suwito Pribadi", "Teknik Komputer dan Informatika", "KO005N"));//6
        daftarDosen.add(new Dosen("Muhammad Rizqi S", "Teknik Komputer dan Informatika", "KO074N"));    //7
        daftarDosen.add(new Dosen("Ade Chandra Nugraha", "Teknik Komputer dan Informatika", "KO001N")); //8
        daftarDosen.add(new Dosen("Zulkifli Arsyad", "Teknik Komputer dan Informatika", "KO061N"));     //9
        daftarDosen.add(new Dosen("Siti Dwi Setiarini", "Teknik Komputer dan Informatika", "KO075N"));  //10
        daftarDosen.add(new Dosen("Yadhi Aditya P.", "Teknik Komputer dan Informatika", "KO052N"));     //11

        // Data Jadwal
        List<MataKuliah> daftarMK = new ArrayList<>();
        daftarMK.add(new MataKuliah("Komputer Grafik", "21IF2015", daftarDosen.get(0), "TE"));                                          //0
        daftarMK.add(new MataKuliah("Komputer Grafik", "21IF2015", daftarDosen.get(1), "PR"));                                          //1
        daftarMK.add(new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "21IF2013", daftarDosen.get(2), "TE"));                       //2
        daftarMK.add(new MataKuliah("Basis Data", "21IF2012", daftarDosen.get(3), "PR"));                                               //3
        daftarMK.add(new MataKuliah("Aljabar Linear", "21IF2014", daftarDosen.get(7), "TE"));                                           //4
        daftarMK.add(new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web", "21IF2016", daftarDosen.get(4), "TE"));      //5
        daftarMK.add(new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web", "21IF2016", daftarDosen.get(5), "PR"));      //6
        daftarMK.add(new MataKuliah("Basis Data", "21IF2012", daftarDosen.get(8), "TE"));                                               //7
        daftarMK.add(new MataKuliah("Pemrograman Berorientasi Objek", "21IF2011", daftarDosen.get(9), "TE"));                           //8
        daftarMK.add(new MataKuliah("Pemrograman Berorientasi Objek", "21IF2011", daftarDosen.get(9), "TE"));                           //9
        daftarMK.add(new MataKuliah("Matematika Diskrit II", "21IF2010", daftarDosen.get(10), "TE"));                                   //10
        daftarMK.add(new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "21IF2013", daftarDosen.get(11), "PR"));                      //11


        List<JadwalPerkuliahan> jadwal = new ArrayList<>();
        jadwal.add(new JadwalPerkuliahan("Senin", "08:40-10:40", "D105-Kelas", daftarMK.get(0), daftarDosen.get(0)));
        jadwal.add(new JadwalPerkuliahan("Senin", "10:40-12:20", "D105-Kelas", daftarMK.get(2), daftarDosen.get(2)));
        jadwal.add(new JadwalPerkuliahan("Senin", "13:00-15:30", "D102-Lab. MT", daftarMK.get(1), daftarDosen.get(1)));
        jadwal.add(new JadwalPerkuliahan("Selasa", "07:00-12:20", "D106-Lab. SDB", daftarMK.get(3), daftarDosen.get(3)));
        jadwal.add(new JadwalPerkuliahan("Selasa", "13:00-14:40", "D101-Kelas", daftarMK.get(4), daftarDosen.get(7)));
        jadwal.add(new JadwalPerkuliahan("Rabu", "07:00-07:50", "D116-Lab. PjBL-2", daftarMK.get(5), daftarDosen.get(4)));
        jadwal.add(new JadwalPerkuliahan("Rabu", "07:50-16:40", "D116-Lab. PjBL-2", daftarMK.get(6), daftarDosen.get(5)));
        jadwal.add(new JadwalPerkuliahan("Kamis", "07:00-08:40", "D105-Kelas", daftarMK.get(7), daftarDosen.get(8)));
        jadwal.add(new JadwalPerkuliahan("Kamis", "08:40-10:40", "D105-Kelas", daftarMK.get(8), daftarDosen.get(9)));
        jadwal.add(new JadwalPerkuliahan("Kamis", "10:40-13:50", "D116-Kelas", daftarMK.get(9), daftarDosen.get(9)));
        jadwal.add(new JadwalPerkuliahan("Kamis", "10:40-13:50", "D108-Kelas", daftarMK.get(10), daftarDosen.get(10)));

        // Tambahkan jadwal lainnya untuk Rabu-Jumat

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menampilkan Data com.polban.jtk.akademik.Mahasiswa
//                    System.out.println("\n=== Data com.polban.jtk.akademik.Mahasiswa ===");

                    tampilkanDataMahasiswa(daftarMahasiswa);
                    break;
                case 2:
                    // Menampilkan Data com.polban.jtk.akademik.Dosen
//                    System.out.println("\n=== Data com.polban.jtk.akademik.Dosen ===");

                    tampilkanDataDosen(daftarDosen);
                    break;
                case 3:
                    // Menampilkan Jadwal Perkuliahan
//                    System.out.println("\n=== Jadwal Perkuliahan ===");
                    tampilkanJadwal(jadwal);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
