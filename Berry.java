
public class Berry{
	private String name;
	private float restoreValue;
	private int type;

	public Berry(int type){
		this.type = type;
		switch(type){
			case 0: this.name = "Berry";
				this.restoreValue = 1;
				break;
			case 1: this.name = "GoldBerry";
				this.restoreValue = 3;
				break;
			case 2: this.name = "MysteryBerry";
				this.restoreValue = 5;
				break;
		}

	}

	public String getName(){
		return this.name;
	}

	public float getRestoreValue(){
		return this.restoreValue;
	}
}