package Elizabet1;

public class RandomGenerator {

	private int previous;
	
	public RandomGenerator(){
		this.previous = 1;
	}
	
	public RandomGenerator(int a){
		this.previous = a;
	}
	
	public RandomGenerator(RandomGenerator ot){
		this.previous = ot.previous;
	}
	
	public int next(){
		int next=this.previous;
		this.previous = ((this.previous * 25173) + 13849) % 65536;
		return next;
	}
	
	public String toString(){
		return this.previous + "";
	}
}
