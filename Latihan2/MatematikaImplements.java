package Latihan2;

public class MatematikaImplements implements MatematikaInterface {
	int hasil;
	void pertambahan(int a,int b) {
		hasil= a + b;
		}
	int getpertambahan() {
		return hasil;
		}
	void pengurangan(int a, int b) {
		hasil= a - b;
		}
	int getpengurangan() {
		return hasil;
		}
	void perkalian(int a,int b) {
		hasil= a * b;
		}
	int getperkalian() {
		return hasil;
		}
	void pembagian(int a,int b) {
		hasil= a / b;
		}
	int getpembagian() {
		return hasil;
		}
	public void pertambahan() {		
	}
	public void pengurangan() {		
	}
	public void perkalian() {		
	}
	public void pembagian() {		
	}
}
