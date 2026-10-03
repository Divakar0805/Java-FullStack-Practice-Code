package constructorinj;

import java.util.List;

public class Metro {
	private String arrived;
	private String destination;
	private String traveltime;
	private double cost;
	private List<String> stopname;
	public Metro(String arrived, String destination, String traveltime, double cost, List<String> stopname) {
		super();
		this.arrived = arrived;
		this.destination = destination;
		this.traveltime = traveltime;
		this.cost = cost;
		this.stopname = stopname;
	}
	@Override
	public String toString() {
		return "Metro [arrived=" + arrived + ", destination=" + destination + ", traveltime=" + traveltime + ", cost="
				+ cost + ", stopname=" + stopname + "]";
	}
	
}
