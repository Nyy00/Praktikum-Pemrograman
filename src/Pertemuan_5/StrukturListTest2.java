package Pertemuan_5;

public class StrukturListTest2 {
        public static void main(String[] args) {
            StrukturList list = new StrukturList(); // Step 1: Create list dengan keyword new
            
            // Step 2: Tambah elemen sehingga elemenlist berisi (2, 6, 3, 5, 1)
            list.addTail(2);
            list.addTail(6);
            list.addTail(3);
            list.addTail(5);
            list.addTail(1);
            
            // Step 3: Tampilkan elemen list
            System.out.println("Elemen list:");
            list.displayElement();
            
            // Step 4: Hapus elemen 3 di tengah list
            list.removeMid(3);
            
            // Step 5: Tampilkan elemen list setelah penghapusan
            System.out.println("Elemen list setelah penghapusan:");
            list.displayElement();
            
            // Tes: Hapus elemen list di tengah lagi
            list.removeMid(5);
            System.out.println("Elemen list setelah penghapusan kedua:");
            list.displayElement();
        }
    }
    
