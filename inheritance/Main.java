package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Father a1 = new Father(77);
		Boy b1 = new Boy();
		
		Boy b2 = new Boy("HEB");
		System.out.println(a1 +" "+ b1+" "+ b2);
		
		Father b3 = new Boy();
		System.out.println(""+b3.goToWork());
	}

}
