package Pertemuan_5;

public class StrukturListTest1 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); // Instruksi 1: Create list dengan keyword new
        
        // Instruksi 2: Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        
        // Instruksi 3: Tampilkan elemen list
        System.out.println("Elemen list setelah penambahan:");
        list.displayElement();
        
        // Instruksi 4: Hapus elemen di akhir list
        list.removeTail();
        
        // Instruksi 5: Tampilkan elemen list
        System.out.println("\nElemen list setelah penghapusan di akhir:");
        list.displayElement();
        
        // Instruksi 6: Hapus elemen di awal list
        list.removeHead();
        
        // Instruksi 7: Tampilkan elemen list
        System.out.println("\nElemen list setelah penghapusan di awal:");
        list.displayElement();
        
        // Tambahkan lagi instruksi untuk menghapus elemen list di akhir
        list.removeTail();
        System.out.println("\nElemen list setelah penghapusan kedua di akhir:");
        list.displayElement();
    }
}
