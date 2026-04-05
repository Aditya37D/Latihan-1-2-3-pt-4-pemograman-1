package p4_Aditya_Darmawan.source_range.latihan;

public class latihan3 {
    public static void main(String[] args) {
        // 1. Inisialisasi Data Pengeluaran
        int makan = 35000;
        int transport = 20000;
        int belanja = 45000;
        double persenDiskon = 0.10; // 10%

        int totalSebelumDiskon = makan + transport + belanja;

        double besarDiskon = totalSebelumDiskon * persenDiskon;

        double totalSetelahDiskon = totalSebelumDiskon - besarDiskon;

        System.out.println("=== Rincian Pengeluaran Mahasiswa ===");
        System.out.println("Makan      : Rp " + makan);
        System.out.println("Transport  : Rp " + transport);
        System.out.println("Belanja    : Rp " + belanja);
        System.out.println("-------------------------------------");
        
        System.out.println("1. Total Pengeluaran Sebelum Diskon: Rp " + totalSebelumDiskon);
        
        System.out.println("2. Besar Diskon (10%): Rp " + (int)besarDiskon);
   
        System.out.println("3. Total Pembayaran Setelah Diskon: Rp " + (int)totalSetelahDiskon);
    }
}
