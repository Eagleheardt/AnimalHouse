import AnimalInterfaces.AnimalNoise;

abstract class Animal implements AnimalNoise{
	private String _name;
	private String _type;
	private String _sound;
	private String _movement;
	
	public String name() {
		return this._name;
	}
	
	public void name(String aName) {
		this._name = aName;
	}
	
	public String type() {
		return this._type;
	}
	
	public void type(String aType) {
		this._type = aType;
	}
	
	public void makeSound() {
		System.out.println("A " + this._type + " goes " + this._sound);
	}

	public void introduceYourself() {
		String output = "";
		output += "My name is " + this._name + "\nI make this noise: " + this._sound;
		System.out.println(output);
	}
	
	public String toString() {
		String output = "";
		output += "Type: " + this._type + "\nName: " + this._name;
		return output;
	}
	
	public void move() {
		System.out.println("This is how I move: " + this._movement);
	}
	
	Animal(){
		this._name = "I have no name.";
		this._sound = "Silent";
		this._movement = "no movement";		
		this._type = "no type";
	}
	
	Animal(String aName, String aSound, String movement, String aType){
		this._name = aName;
		this._sound = aSound;
		this._movement = movement;
		this._type = aType;
	}

}