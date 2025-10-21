import java.util.ArrayList;

public class CatatanKeuangan {
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public void tambahTransaksi(Transaksi t) {
        daftarTransaksi.add(t);
        System.out.println("Transaksi berhasil ditambahkan!");
    }

    public void lihatCatatan() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi!");
        } else {
            for (Transaksi t : daftarTransaksi) {
                String tanda = t.getJenis().equalsIgnoreCase("Pemasukan") ? "+" : "-";
                System.out.println(tanda + " Rp" + t.getNominal() + " (" + t.getJenis() + ")");
            }
        }
    }

    public void hitungSaldo() {
        double saldo = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t.getJenis().equalsIgnoreCase("Pemasukan")) {
                saldo += t.getNominal();
            } else {
                saldo -= t.getNominal();
            }
        }
        System.out.println("Saldo saat ini: Rp " + saldo);
    }
}
