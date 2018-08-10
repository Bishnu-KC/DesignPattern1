package com.structural.decorator;

public class CarDealer {

	public static void main(String[] args) {
		Car buggati=new SportsCar();
		Car musicSystem=new MusicSystem(buggati);
		Car bumperSticker=new BumperSticker(musicSystem,"Red");
		System.out.println("Car Information= "+bumperSticker.getDetails()+",cost"+bumperSticker.calculateCost());

	}

}
