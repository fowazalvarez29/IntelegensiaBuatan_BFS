package Tugas01StudyCaseBFS;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    // Fungsi untuk menjalankan algoritma BFS dan mencari jalur terpendek
    public static List<Node> bfs(Graph graph, String start, String goal) {
        Queue<List<Node>> queue = new LinkedList<>(); // Antrian untuk menyimpan jalur
        queue.add(new ArrayList<>(List.of(graph.getNode(start)))); // Menambahkan simpul awal ke dalam jalur

        // Melakukan BFS
        while (!queue.isEmpty()) {
            List<Node> path = queue.poll(); // Mengambil jalur dari antrian
            Node node = path.get(path.size() - 1); // Mengambil simpul terakhir dari jalur

            // Jika simpul terakhir adalah tujuan, kembalikan jalur tersebut
            if (node.getNilai().equals(goal)) {
                return path;
            }

            // Mengunjungi tetangga-tetangga dari simpul
            for (Node neighbor : node.getTetangga()) {
                if (!path.contains(neighbor)) {
                    List<Node> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath); // Menambahkan jalur baru ke dalam antrian
                }
            }
        }

        return new ArrayList<>(); // Mengembalikan jalur kosong jika tidak ditemukan jalur ke tujuan
    }
}
