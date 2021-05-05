package inheritance;

public class Father implements Person {

	String eyesColor = "blue";
	String lang = "idish";
	
	int age;
//	int infAge  = 99;
	
	public Father() {this.age=infAge;}
	
	
	public Father(int age) {
		this.age=age;
	}

	public String getEyesColor() {
		return eyesColor;
	}



	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}



	public String getLang() {
		return lang;
	}



	public void setLang(String lang) {
		this.lang = lang;
	}




	@Override
	public String toString() {
		return "Father [eyesColor=" + eyesColor + ", lang=" + lang + ", age=" + age + "]";
	}


	//=============
	@Override
	public String goToWork() {
		return "Father go to bank";
	}
}
