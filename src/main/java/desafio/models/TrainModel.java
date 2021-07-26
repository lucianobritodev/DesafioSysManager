package desafio.models;

import desafio.enuns.WayWagonEnum;

public interface TrainModel {

	void berth(WagonModel wagon);
	void unberth(WagonModel wagon, WayWagonEnum way);
	void printWagons();
}
