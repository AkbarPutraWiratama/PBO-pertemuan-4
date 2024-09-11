package Latihan1;

public class MatematikaBeraksi {
	public static void main(String[] args) {
		Matematika soal1 = new Matematika();
		soal1.pertambahan(20,10);
		System.out.println("Pertambahan: " + soal1.getpertambahan());
		Matematika soal2 = new Matematika();
		soal2.pengurangan(10,5);
		System.out.println("Pengurangan: " + soal2.getpengurangan());
		Matematika soal3 = new Matematika();
		soal3.perkalian(10,3);
		System.out.println("Perkalian: " + soal3.getperkalian());
		Matematika soal4 = new Matematika();
		soal4.pembagian(21,2);
		System.out.println("Pembagiann: " + soal4.getpembagian());
		}
}
