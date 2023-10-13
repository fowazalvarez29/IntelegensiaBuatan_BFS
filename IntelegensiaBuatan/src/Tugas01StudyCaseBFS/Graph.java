package Tugas01StudyCaseBFS;

import java.util.ArrayList;
import java.util.List;

//Representasi graf yang terdiri dari kumpulan simpul
class Graph {
	private List<Node> nodes; // Daftar simpul dalam graf

	// Konstruktor untuk membuat objek graf kosong
	public Graph() {
		nodes = new ArrayList<>();
	}

	// Menambahkan simpul ke dalam graf
	public void tambahNode(Node node) {
		nodes.add(node);
	}

	// Mendapatkan simpul berdasarkan nilai kota
	public Node getNode(String nilai) {
		for (Node node : nodes) {
			if (node.getNilai().equals(nilai)) {
				return node;
			}
		}
		return null;
	}
}