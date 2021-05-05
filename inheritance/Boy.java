package inheritance;

public class Boy extends Father{

	String _lang;
	String eyesColor;
	
	public Boy() {
		this._lang = super.lang;
		this.eyesColor = super.eyesColor;
	}
	
	public Boy(String newLang) {
		this._lang = newLang+ " and "+ super.lang;
		this.eyesColor = super.eyesColor;
	}
	
	@Override
	public String goToWork() {
		return "Boy go to HighTc";
	}
	

	@Override
	public String toString() {
		return "Boy [_lang=" + _lang + ", eyesColor=" + eyesColor + "]";
	}

	public String get_lang() {
		return _lang;
	}

	public void set_lang(String _lang) {
		this._lang = _lang;
	}

	public String get_eyesCol() {
		return eyesColor;
	}

	public void set_eyesCol(String _eyescol) {
		this.eyesColor = _eyescol;
	}
}
