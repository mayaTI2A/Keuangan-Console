import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CatatanKeuangan catatan = new CatatanKeuangan();
        int pilih;

        do {
            System.out.println("\n=== APLIKASI CATATAN KEUANGAN PRIBADI ===");
            System.out.println("1. Tambah Pemasukan");
            System.out.println("2. Tambah Pengeluaran");
            System.out.println("3. Lihat Catatan Keuangan");
            System.out.println("4. Lihat Total Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nominal pemasukan: ");
                    double in = input.nextDouble();
                    catatan.tambahTransaksi(new Transaksi(in, "Pemasukan"));
                    break;
                case 2:
                    System.out.print("Masukkan nominal pengeluaran: ");
                    double out = input.nextDouble();
                    catatan.tambahTransaksi(new Transaksi(out, "Pengeluaran"));
                    break;
                case 3:
                    catatan.lihatCatatan();
                    break;
                case 4:
                    catatan.hitungSaldo();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}
