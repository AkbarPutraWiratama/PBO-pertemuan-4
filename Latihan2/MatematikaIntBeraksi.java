package Latihan2;

public class MatematikaIntBeraksi {
	public static void main(String[] args) {
		MatematikaImplements soal1 = new MatematikaImplements();
		soal1.pertambahan(20,10);
		System.out.println("Pertambahan: " + soal1.getpertambahan());
		MatematikaImplements soal2 = new MatematikaImplements();
		soal2.pengurangan(10,5);
		System.out.println("Pengurangan: " + soal2.getpengurangan());
		MatematikaImplements soal3 = new MatematikaImplements();
		soal3.perkalian(10,3);
		System.out.println("Perkalian: " + soal3.getperkalian());
		MatematikaImplements soal4 = new MatematikaImplements();
		soal4.pembagian(21,2);
		System.out.println("Pembagiann: " + soal4.getpembagian());
		}
}
