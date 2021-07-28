package application;

import desafio.entities.TrainComposition;
import desafio.entities.Wagon;
import desafio.enuns.WayWagonEnum;
import desafio.util.Count;

public class Program {

	public static void main(String[] args) {

		// Challenge One
		
		TrainComposition train = new TrainComposition();
		
		Wagon wagon1 = new Wagon(7, WayWagonEnum.LEFT);
		Wagon wagon2 = new Wagon(13, WayWagonEnum.LEFT);
		
		train.berth(wagon1);
		train.berth(wagon2);
		train.printWagons();
		
		System.out.println("---------------------------------------\n");
		
		train.unberth(wagon1, WayWagonEnum.LEFT); // tentativa de desatracar elemento pela esquerda
		train.printWagons();
		
		System.out.println("---------------------------------------\n");
		
		// Challenge Two
		
		Count.countNumbers(new int[] {7,5,3,1}, 4);
	}

}
