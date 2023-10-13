package Tugas01StudyCaseBFS;

import java.util.ArrayList;
import java.util.List;

//Representasi jalur atau solusi dari satu kota ke kota lainnya
class Solusi {
	private List<Node> nodes; // Daftar simpul yang membentuk jalur
	private Node node; // Simpul tujuan akhir

	// Konstruktor untuk membuat objek Solusi
	public Solusi() {
     nodes = new ArrayList<>();
	}

	// Mengatur simpul tujuan akhir
	public void setNode(Node node) {
		this.node = node;
	}

	// Mendapatkan simpul tujuan akhir
	public Node getNode() {
		return node;
	}

	// Mengatur daftar simpul yang membentuk jalur
	public void setNodes(List<Node> nodes) {
		this.nodes = new ArrayList<>(nodes);
	}

	// Mendapatkan daftar simpul yang membentuk jalur
	public List<Node> getNodes() {
		return nodes;
	}
}