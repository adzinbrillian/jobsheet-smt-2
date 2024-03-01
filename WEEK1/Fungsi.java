package WEEK1;

public class Fungsi {

    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    
    static int[] harga = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock[i]);
            System.out.println("~");
            System.out.println("Pendapatan Cabang RoyalGarden " + (i + 1) +": Rp " + pendapatan);
        }
        System.out.println("~");
        System.out.println();
        stocCabang();
        System.out.println();
        kurangiStock();
    } 
    public static int hitungPendapatan(int[] stock) {
        int pendapatan = 0;
        for (int i = 0; i < stock.length; i++) {
            pendapatan += stock[i] * harga[i];
        }
        return pendapatan;
    }
    public static void stocCabang() {
        System.out.println("~");
        System.out.println("Menampilkan Stock");
        for (int j = 0; j < stock.length; j++) {
            int cabangTerpilih = j;
            int[] stockBarang = stock[cabangTerpilih];

            System.out.print("Total Stock Cabang RoyalGarden " + (cabangTerpilih + j) + ": ");
            for (int i = 0; i < stock.length; i++) {
                System.out.print(stock[i] + " ");
            }
            System.out.println();

        }
    }
    public static void kurangiStock() {
        System.out.println("~");
        System.out.println("Pengurangan Stock");
        for (int i = 0; i < stock.length; i++) {
            int cabangTerpilih = i;
            int[] stockCabang = stock[cabangTerpilih];
            int[] pengurangan = {1, 2, 0, 5};
            
            System.out.print("Total Stock Cabang RoyalGarden " + (cabangTerpilih + i) + ": ");
            for (int j = 0; j < stockCabang.length; j++) {
                stockCabang[j] -= pengurangan [j];
                System.out.print(stockCabang[j] + " ");
            }
        }
    }
}
    

