import java.util.Scanner;

class Kotak {
	public int panjang;
	public int lebar;
	public int tinggi;
	
	public int volume() {
		return panjang*lebar*tinggi;
	}
	
	public static void main(String [] args){
		Kotak kotak = new Kotak();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Masukan nilai panjang: ");
		kotak.panjang = in.nextInt();
		
		System.out.println("Masukan nilailebar: ");
		kotak.lebar = in.nextInt();
		
		System.out.println("Masukan nilai tinggi: ");
		kotak.tinggi = in.nextInt();
		
		System.out.println(String.format("volume kotak: %s", kotak.volume()));
	}
}
