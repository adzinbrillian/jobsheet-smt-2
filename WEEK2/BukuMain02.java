package WEEK2;

public class BukuMain02 {
    
    public static void main(String[] args) {
        
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        

        

        Buku02 bk2 = new Buku02("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(5);
        bk2.tampilInformasi();


        int hitunganHargaTotal(int jml) {
            return harga * jml;

        }

        int hitungDiskon(int jml) { 
            int diskon = 0;
            int hargaTotal = hitunganHargaTotal(jml);
            if (hargaTotal > 150000)
                diskon = (int) (0.12*hargaTotal);
            else if (hargaTotal < 150000 && hargaTotal > 75000)
                diskon = (int)(0.05*hargaTotal);
            else 
                diskon = 0;
            return diskon;
        }

        int hitunganHargaBayar(int jml) {
            return hitungHargaBayar(int jml) - hitungDiskon(jml);
            
        } 

    }
}