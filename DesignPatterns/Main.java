package DesignPatterns;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Superman singlton = Superman.getSingleton();
	Superman singlton2 = Superman.getSingleton();
	System.out.println(singlton.custum);
	System.out.println(singlton2.custum);
	
	
	singlton.custum = singlton.custum.toUpperCase();
	System.out.println(singlton.custum);
	System.out.println(singlton2.custum);
	}

}
