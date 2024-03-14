package Pertemuan_6;

public class StrukturListTest1 {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen sehingga elemen list berisi (7, 6, 4, 2, 3)
        myList.addTail(7);
        myList.addTail(6);
        myList.addTail(4);
        myList.addTail(2);
        myList.addTail(3);

        // 3. Tampilkan elemen list
        System.out.println("Urutan Instruksi Output:");

        System.out.println("Tampilkan elemen list:");
        myList.displayElement();

        // 4. Tampilkan size elemen list
        System.out.println("Tampilkan size elemen list:");
        System.out.println(myList.size());
    }
}
