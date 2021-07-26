package desafio.entities;

import desafio.enuns.WayWagonEnum;
import desafio.models.WagonModel;

public class Wagon implements WagonModel {
	
	private int order;
	private WayWagonEnum way;
	
	public Wagon() {
	}
	
	public Wagon(int order, WayWagonEnum way) {
		super();
		this.order = order;
		this.way = way;
	}
	
	public int getOrder() {
		return order;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	public void setWay(WayWagonEnum way) {
		this.way = way;
	}
	
	@Override
	public String getWay() {
		return way.name();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + order;
		result = prime * result + ((way == null) ? 0 : way.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wagon other = (Wagon) obj;
		if (order != other.order)
			return false;
		if (way != other.way)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "wagon [order=" + order + ", way=" + way + "]";
	}

}
