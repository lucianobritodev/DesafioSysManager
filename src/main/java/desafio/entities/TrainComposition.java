package desafio.entities;

import java.util.ArrayList;
import java.util.List;

import desafio.enuns.WayWagonEnum;
import desafio.models.TrainModel;
import desafio.models.WagonModel;

public class TrainComposition implements TrainModel {

	private List<WagonModel> train = new ArrayList<>();

	public TrainComposition() {}

	public TrainComposition(WagonModel wagon) {
		this.train.add(wagon);
	}

	public void printWagons() {
		for (WagonModel wagon : train) {
			System.out.println(wagon + " index: " + train.indexOf(wagon));
		}
	}

	@Override
	public void berth(WagonModel wagon) {
		if (wagon.getWay().equalsIgnoreCase("LEFT")) {
			train.add(0, wagon);
		} else {
			train.add(wagon);
		}
	}

	@Override
	public void unberth(WagonModel wagon, WayWagonEnum way) {

		if (way.name().equalsIgnoreCase("RIGHT")) {
			if (train.indexOf(wagon) == (train.size() - 1)) {
				train.remove(train.indexOf(wagon));
			} else {
				System.out.println(
						"Elemento "
						+ wagon.getOrder()
						+ " não pode ser removido, pois não é o primeiro vagão da direita!");
			}
		} else {
			if (train.indexOf(wagon) == 0) {
				train.remove(train.indexOf(wagon));
			} else {
				System.out.println(
						"Elemento de numeração "
						+ wagon.getOrder()
						+ " não pode ser removido, pois não é o primeiro vagão da esquerda!");
			}
		}
	}

}
