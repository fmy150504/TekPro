package Kasus1;
/**
 *
 * @author Farhan Muhammad Yasin
 */

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public void setStok(int stk){
        this.stok += stk;
    }

    public int getStok(){
        return this.stok;
    }
}