package Pertemuan_5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);
        
        System.out.println("Elemen list setelah penambahan:");
        list.displayElement();
        
        // Instruksi 6: Hapus elemen list di awal list
        list.removeHead();
        
        // Instruksi 7: Tampilkan elemen list setelah penghapusan
        System.out.println("\nElemen list setelah penghapusan:");
        list.displayElement();
        
        // Lakukan hapus elemen list di awal list sebanyak 3x
        for (int i = 0; i < 3; i++) {
            list.removeHead();
            System.out.println("\nElemen list setelah penghapusan ke-" + (i+1) + ":");
            list.displayElement();
        }
    }
}
