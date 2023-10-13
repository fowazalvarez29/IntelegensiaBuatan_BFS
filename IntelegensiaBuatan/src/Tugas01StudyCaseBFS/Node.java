package Tugas01StudyCaseBFS;

import java.util.ArrayList;
import java.util.List;

// Representasi simpul dalam graf
class Node {
    private String nilai; // Nama kota
    private List<Node> tetangga; // Daftar kota tetangga

    // Konstruktor untuk membuat objek Node dengan nilai tertentu
    public Node(String nilai) {
        this.nilai = nilai;
        tetangga = new ArrayList<>();
    }

    // Mendapatkan nilai kota
    public String getNilai() {
        return nilai;
    }

    // Menambahkan kota tetangga
    public void tambahTetangga(Node node) {
        tetangga.add(node);
    }

    // Mendapatkan daftar kota tetangga
    public List<Node> getTetangga() {
        return tetangga;
    }

    // Metode equals untuk membandingkan dua objek Node berdasarkan nilai mereka
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node node = (Node) obj;
        return nilai.equals(node.nilai);
    }

    // Metode hashCode untuk menghasilkan nilai hash berdasarkan nilai kota
    @Override
    public int hashCode() {
        return nilai.hashCode();
    }
}