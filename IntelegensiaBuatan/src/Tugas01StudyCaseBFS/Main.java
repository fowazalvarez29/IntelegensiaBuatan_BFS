package Tugas01StudyCaseBFS;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Membangun graf dengan simpul-simpul yang merepresentasikan kota-kota di Jawa Barat
        Graph g = new Graph();
        Node bandung = new Node("Bandung");
        Node cimahi = new Node("Cimahi");
        Node sumedang = new Node("Sumedang");
        Node padalarang = new Node("Padalarang");
        Node soreang = new Node("Soreang");
        Node majalengka = new Node("Majalengka");
        Node subang = new Node("Subang");

        // Menambahkan simpul-simpul ke dalam graf
        g.tambahNode(bandung);
        g.tambahNode(cimahi);
        g.tambahNode(sumedang);
        g.tambahNode(padalarang);
        g.tambahNode(soreang);
        g.tambahNode(majalengka);
        g.tambahNode(subang);

        // Menambahkan jalur-jalur antar kota
        bandung.tambahTetangga(cimahi);
        bandung.tambahTetangga(sumedang);
        cimahi.tambahTetangga(padalarang);
        sumedang.tambahTetangga(majalengka);
        padalarang.tambahTetangga(soreang);
        padalarang.tambahTetangga(subang);

        String start = "Bandung";
        String goal = "Subang";

        // Menjalankan algoritma BFS untuk mencari jalur terpendek dari Bandung ke Subang
        List<Node> shortestPath = BreadthFirstSearch.bfs(g, start, goal);

        // Menampilkan hasil jalur terpendek
        if (!shortestPath.isEmpty()) {
            System.out.print("Jalur terpendek dari " + start + " ke " + goal + " adalah: ");
            for (Node node : shortestPath) {
                System.out.print(node.getNilai());
                if (!node.getNilai().equals(goal)) {
                    System.out.print(" -> ");
                }
            }
        } else {
            System.out.println("Tidak ada jalur yang tersedia dari " + start + " ke " + goal);
        }
    }
}