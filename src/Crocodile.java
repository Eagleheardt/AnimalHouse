
public class Crocodile extends Reptile{
	
	public void bask() {
		System.out.println("I like to bask in the sun.");		
	}
	
	Crocodile(){
		super();
	}
	
	Crocodile(String aName){
		super(aName, "roar", "crawl", "crocodile");
	}

}
