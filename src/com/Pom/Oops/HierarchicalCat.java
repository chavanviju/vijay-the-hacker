package com.Pom.Oops;

public class HierarchicalCat extends Animal {
	
	
	
	
	public void Running() {
		
		System.out.println("Running");
	}
	
	
	
	public static void main(String[] args) {
		HierarchicalCat obj=new HierarchicalCat();
		
		obj.eat();
		obj.Running();
		
	}

}
