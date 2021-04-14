
package gettersetter1;


public class GetterSetter {
    
    //mendeklarasikan variabel dengan access modifier private
    private String nama, jenis, keterangan;
    private int harga, stok;
    
    
    //membuat setter untuk masing masing variabel
    public void Setnama(String nama){
        this.nama = nama;
    }
    public void Setjenis(String jenis){
        this.jenis = jenis;
    }
    public void Setketerangan(String keterangan){
        this.keterangan = keterangan;
    }
    public void Setharga(int harga){
        this.harga = harga;
    }
    public void Setstok(int stok){
        this.stok = stok;
    }
    
    //membuat getter
    public String Getnama(){
        return nama;
    }
    public String Getjenis(){
        return jenis;
    }
    public String Getketerangan(){
        return keterangan;
    }
    public int Getharga(){
        return harga;
    }
    public int Getstok(){
        return stok;
    }
}
