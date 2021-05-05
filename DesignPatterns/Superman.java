package DesignPatterns;

public class Superman {

public String custum;
public String powers;
private static Superman superman = null;

private Superman() {
	custum = "blue and red";
	powers = "ON";
}

public static Superman getSingleton() {
	if(superman == null)
		superman = new Superman();
	return superman;
}
}
