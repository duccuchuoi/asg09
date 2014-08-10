package oop.asg09;


public class NumeralItem implements Item {
	
	private int value;
	
	public NumeralItem(int value){
		this.value=value;
	}
	
	
	public Item clone(){
		return null ;
	}
	
	public String toString(){
		return ""+value;
	}

	@Override
	public boolean equals(MyList mylist) {
		return false;
	}

}