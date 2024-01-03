
package com.abstractionInterface;

public class ExecutionMobiles{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OnePlus oneplus=new NordCE2();
		oneplus.brandName();
		oneplus.pcamera();
		oneplus.scamera();
		oneplus.colour();
		oneplus.ram();
		oneplus.rom();
		oneplus.price();
		System.out.println(Mobiles.Buildmaterial);
		System.out.println(Mobiles.Display);
		System.out.println("=======================");
		
		Redmi one=new Note12Pro();
		System.out.println(Mobiles.Buildmaterial);
		System.out.println(Mobiles.Display);
		one.brandName();
		one.pcamera();
		one.scamera();
		one.colour();
		one.ram();
		one.rom();
		one.price();
		
	}

}
