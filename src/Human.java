
public class Human {
	private Animal _pet;
	private String _name;
	
	public void setPet(Animal pet) {
		this._pet = pet;		
	}
	
	public Animal getPet() {
		return this._pet;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	public String getName() {
		return this._name;
	}
	
	public void introducePet() {
		System.out.print("My name is " + this._name + " and this is my " + this._pet.type() + ".\n");
		this._pet.introduceYourself();
	}
	
	@Override
	public String toString() {
		return this._name;
	}
	
	Human(){
		this._name = "No name";
	}
	
	Human(String name, Animal pet){
		this._name = name;
		this._pet = pet;		
	}
} // end of Human class
