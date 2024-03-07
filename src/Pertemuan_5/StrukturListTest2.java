package Pertemuan_5;

public class StrukturListTest2 {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList elemenList = new StrukturList();

        // 2. Tambah elemen sehingga elemenlist berisi (2, 6, 3, 5, 1)
        elemenList.addTail(2);
        elemenList.addTail(6);
        elemenList.addTail(3);
        elemenList.addTail(5);
        elemenList.addTail(1);

        // 3. Tampilkan elemen list
        System.out.println("Elemen List:");
        elemenList.displayElement();

        // 4. Hapus elemen 3 di tengah list
        elemenList.removeMid(3);

        // 5. Tampilkan elemen list setelah penghapusan
        System.out.println("\nElemen List setelah penghapusan:");
        elemenList.displayElement();

         // 6. Hapus elemen 6 di tengah list
         elemenList.removeMid(6);

         // 7. Hapus elemen 5 di tengah list
         elemenList.removeMid(5);

         // 7. Tampilkan elemen list setelah penghapusan
         System.out.println("\nElemen List setelah penghapusan kedua:");
         elemenList.displayElement();
    }
}  
