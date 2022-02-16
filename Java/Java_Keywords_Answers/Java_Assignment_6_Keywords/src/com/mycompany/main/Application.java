package com.mycompany.main;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		float x,y;
		x = 100.55f;
		y = 1291.324f;
		
		System.out.println("Addition result: " + StaticClass.add(x, y));
		
		FinalClass fc = new FinalClass();
		System.out.println("The constant: " + fc.myConstant);
		
		ConcreteClass cc =  new ConcreteClass();
		cc.run();
	}
}
