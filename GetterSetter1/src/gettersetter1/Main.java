
package gettersetter1;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        int i = 0;  //mendeklarasi variabel untuk perulangan array object
        
        GetterSetter [] barang = new GetterSetter[100];     //membuat object array dengan nilai maksimal 100
        Scanner input = new Scanner(System.in);     //membuat objeck Scanner 
        
        System.out.println("== Program Menampilkan informasi barang dagangan ==");
        
        //membuat perulangan mengisi data object barang yang terus berulang hingga di break atau di berhentikan
        while(true){
            
            //membuat object class baru sesuai dengan nilai i
            barang[i] = new GetterSetter();
            
            
            
            //mengisi data barang / variabel dari object menggunakan setter
            System.out.println("masukan informasi barang dagangan anda");
            System.out.println("nama barang : ");
            barang[i].Setnama(input.nextLine());
            System.out.println("jenis barang :");
            barang[i].Setjenis(input.nextLine());
            System.out.println("harga barang :");
            barang[i].Setharga(input.nextInt());
            System.out.println("stok barang");
            barang[i].Setstok(input.nextInt());
            input.nextLine();
            System.out.println("keterangan barang :");
            barang[i].Setketerangan(input.nextLine());
            
            System.out.println("apabila ingin menambah barang masukan 'y' ");
            char tambah = input.next().charAt(0);   //mengisi nilai varibel yang digunakan untuk percabangan
            input.nextLine();
            System.out.println();
            
            //membuat percabangan yang nilainya ditentukan oleh variabel yang diisi sebelumnya
            if(tambah == 'y'){  //jika nilai varibel "tambah" bernilai dengan 'y' maka nilai i ditambah 1 dan perulangan tetap dijalankan
                i++;
            }
            else{   //jika nilai "tambah" tidak sama dengan 'y' maka perulangan akan di hentikan / di break
                break;
            }
        }
        
        //membuat perulangan untuk menampilkan seluruh nilai dari object barang 
        for (int a = 0; a <= i; a++){   //untuk nilai a sama dengan 0, jika nilai a kurang dari i maka jalankan kode di bawah, lalu tambahkan nilai a dengan 1
            
            //menampilkan seluruh nilai dari object barang menggunakan getter
            System.out.println("==| barang "+(a+1)+" |==");
            System.out.println("nama        : "+barang[a].Getnama());
            System.out.println("jenis       : "+barang[a].Getjenis());
            System.out.println("keterangan  : "+barang[a].Getketerangan());
            System.out.println("harga       : "+barang[a].Getharga());
            System.out.println("stok        : "+barang[a].Getstok());
            System.out.println();
        }
    }
    
}








/*
Scanner input = new Scanner(System.in);
        
        GetterSetter barang = new GetterSetter();
        String nama = input.nextLine();
        barang.Setnama(nama);
        
        System.out.println(barang.Getnama());
        
*/