package Elizabet1;

import java.util.Calendar;


public class RandomGenerator2 {

	private int previous;
	
	public RandomGenerator2(){
		this.previous = (int) Calendar.getInstance().getTime().getTime() %65536;
	}
	
	public RandomGenerator2(int a){
		this.previous = a;
	}
	
	public RandomGenerator2(RandomGenerator2 ot){
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
