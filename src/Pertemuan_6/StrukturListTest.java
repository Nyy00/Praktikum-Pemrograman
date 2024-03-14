package Pertemuan_6;

import java.util.ArrayList;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        ArrayList<Integer> myList = new ArrayList<>();

        // 2. Tambah elemen 5 di akhir list
        myList.add(5);

        // 3. Tambah elemen 4 di akhir list
        myList.add(4);

        // 4. Tambah elemen 6 di akhir list
        myList.add(6);

        // 5. Tampilkan elemen list
        System.out.print("Urutan Instruksi Output:\n5 4 6\n");

        // Menampilkan elemen list
        for (Integer element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 6. Cari elemen bernilai 6
        int searchElement = 6;
        boolean found = myList.contains(searchElement);
        System.out.println(found);
    }
}
