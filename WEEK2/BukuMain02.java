package WEEK2;

public class BukuMain02 {
    
    public static void main(String[] args) {
        
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilanInformasi();
        bk1.terjual(jml:5);
        bk1.gantiHarga(hrg:60000);
        bk1.tampilanInformasi();

    }
}