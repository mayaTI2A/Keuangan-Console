public class Transaksi {
    private double nominal;
    private String jenis;

    public Transaksi(double nominal, String jenis) {
        this.nominal = nominal;
        this.jenis = jenis;
    }

    public double getNominal() { return nominal; }
    public String getJenis() { return jenis; }
}
