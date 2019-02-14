import AnimalInterfaces.IReptile;

abstract class Reptile extends Animal implements IReptile{
	
	public void bask() {
		System.out.println("I like to bask in the sun.");
	}
	
	Reptile(){
		super();
	}
	
	Reptile(String aName, String aNoise, String locomotion, String type){
		super(aName, aNoise, locomotion, type);
	}
}
