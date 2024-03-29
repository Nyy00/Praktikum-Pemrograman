package Pertemuan_6;

import Pertemuan_3.Node;

public class StrukturList {
    private Node HEAD;
    
    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    //fungsi menambahkan data AddHead List
    public void addHead(double data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            newnode.setNext(HEAD);
            HEAD = newnode;
        }
    }
    
    //fungsi menambahkan data di depan
    public void addTail(double data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            Node curNode = HEAD;
            Node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newnode);
        }
    }

    //fungsi menambahkan data di tengah
    public void addMiddle(double data, int pos) {
        Node newnode = new Node(data);
        Node curNode = HEAD;
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            Node posNode = null;
            if (pos == 1) {
                newnode.setNext(HEAD);
                HEAD = newnode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newnode);
                newnode.setNext(curNode);
            }
        }
    }

    // menampilkan isi linked list
    public void displayElement() {
        Node curNode = HEAD;

        while(curNode != null) {
            System.out.println(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
    
    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }    
    //
    public void removeHead() {
    	if (isEmpty()) {
    		System.out.println("List Kosong");
    	}
    	else {
    		Node temp = HEAD;
    		HEAD = HEAD.getNext();
    		dispose(temp);
    	}
    }
    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            if (HEAD.getNext() == null) { 
                HEAD = null;
            } else {
                Node curNode = HEAD;
                Node prevNode = null;
                while (curNode.getNext() != null) {
                    prevNode = curNode;
                    curNode = curNode.getNext();
                }
                prevNode.setNext(null); 
                dispose(curNode);
            }
        }
    }

    public void removeMid(int e) {
        Node preNode = null;
        Node tempNode;
        boolean ketemu = false;
    
        if (isEmpty()) {
            System.out.println("Element List Kosong");
        } else {
            tempNode = HEAD;
            while (tempNode != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                }
            }
            if (ketemu) {
                if (preNode == null) { // Jika node yang akan dihapus adalah node pertama
                    HEAD = tempNode.getNext();
                } else {
                    preNode.setNext(tempNode.getNext());
                }
                dispose(tempNode);
            } else {
                System.out.println("Elemen tidak ditemukan dalam list");
            }
        }
    }
    public boolean find(int x) {
        
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData() == x)
                ketemu = true;
            else
                curNode = curNode.getNext();
        }
        return ketemu;
    }

    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;
    
        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }
    
        return jumlah;
    }    

    public void hapusSemuaElemen() {
        HEAD = null;
    }
    
    
}

