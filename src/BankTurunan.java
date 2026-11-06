public class BankTurunan {
    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro budi = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        ani.cetakInfo();
        budi.cetakInfo();

        System.out.println("\n============ TRANSAKSI ============");
        cetak("Tabungan tarik 1.500.000", ani.tarik(1500000));
        cetak("Giro tarik 500.000", budi.tarik(500000));
        cetak("Giro tarik 300.000", budi.tarik(300000));
        cetak("Giro setor 100.000", budi.setor(100000));
        int bunga = ani.tambahBunga();
        System.out.printf("%-26s: %s%n", "Bunga tabungan", Rekening.formatRupiah(bunga));

        System.out.println("\n========== REKENING AKHIR =========");
        ani.cetakInfo();
        budi.cetakInfo();
    }

    private static void cetak(String label, boolean berhasil) {
        System.out.printf("%-26s: %s%n", label, berhasil ? "Berhasil" : "Ditolak");
    }
}

