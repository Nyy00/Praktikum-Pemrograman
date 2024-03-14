package Pertemuan_6;

public class StrukturListTest2 {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen sehingga elemen list berisi (4, 3, 7, 8, 1, 9)
        myList.addTail(4);
        myList.addTail(3);
        myList.addTail(7);
        myList.addTail(8);
        myList.addTail(1);
        myList.addTail(9);

        // 3. Tampilkan elemen list
        System.out.println("Urutan Instruksi Output:");

        System.out.println("Tampilkan elemen list:");
        myList.displayElement();

        // 4. Hapus semua elemen list
        System.out.println("Hapus semua elemen list:");
        myList.hapusSemuaElemen();

        // 5. Tampilkan elemen list
        System.out.println("Tampilkan elemen list:");
        if (myList.isEmpty()) {
            System.out.println("List Kosong");
        } else {
            myList.displayElement();
        }
}
}
