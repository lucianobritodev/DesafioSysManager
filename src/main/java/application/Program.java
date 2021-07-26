package application;

import desafio.entities.TrainComposition;
import desafio.entities.Wagon;
import desafio.enuns.WayWagonEnum;

public class Program {

	public static void main(String[] args) {

		TrainComposition train = new TrainComposition();
		
		Wagon wagon1 = new Wagon(7, WayWagonEnum.LEFT);
		Wagon wagon2 = new Wagon(13, WayWagonEnum.LEFT);
		
		train.berth(wagon1);
		train.berth(wagon2);
		train.printWagons();
		
		System.out.println("---------------------------------------");
		
		train.unberth(wagon1, WayWagonEnum.LEFT);
		train.printWagons();
		
	}

}
