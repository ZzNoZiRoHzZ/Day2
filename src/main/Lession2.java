package main;

public class Lession2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum1 = 2;
		byte myNum2 = 3;
		short myNum3 = 4;
		int myNum4 = 5;
		long myNum5 =6;
		
		float myNum6 = 7.5f;
		double myNum7 = 8.5f;
		
		boolean isNum8 = true;
		char kyTu = 'K';
		String myName = "Khoa";
		
		int firstNum = 17;
		int secondNum = 5;
		
		int lengthV = 5;
		
		
		int length = 2;
		int width = 4;
		
		hoten();
		System.out.println("Tong :" + tong(firstNum,secondNum));
		System.out.println("Hieu :" + hieu(firstNum,secondNum));
		System.out.println("Tich :" + tich(firstNum,secondNum));
		System.out.println("Thuong :" + thuong(firstNum,secondNum));
		System.out.println("Chu vi hinh vuong : " + Svuong(lengthV));
		System.out.println("Dien tich hinh vuong: " + Vvuong(lengthV));
		System.out.println("Chu vi hinh chu nhat: " + Snhat(length, width));
		System.out.println("Dien tich hinh chu nhat: " + Vnhat(length, width));

	}
	
	public static void hoten() {
		System.out.println("HoTen: Nguyen DAng Khoa");
	}
	
	public static int tong(int a, int b) {
		
		int Tong= a+b;
		return Tong;
		
	}
	
	public static int hieu(int a, int b) {
		
		int Hieu = a+b;
		return Hieu;
	}
	
	public static int tich(int a, int b) {
		
		int Tich = a*b;
		return Tich;
	}
	
	public static float thuong(int a, int b) {
		
		float Thuong = a/b;
		return Thuong;
	}
	
	public static int Svuong(int a) {
		
		int SVuong = 4*a;
		return SVuong;
		
	}
	
	public static int Vvuong(int a) {
		
		int VVuong = a*a;
		return VVuong;
		
	}
	
	public static int Snhat(int a, int b) {
		
		int SNhat = 2*(a+b);
		return SNhat;
		
	}
	
	public static int Vnhat(int a, int b) {
		
		int VNhat = a*b;
		return VNhat;
		
	}
	

}
