package map;

import java.util.Map;

public class Hotel {
	private String name;
	private String loc;
	private String gstno;
	private double rating;
	private Map<String,Double> menu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getGstno() {
		return gstno;
	}
	public void setGstno(String gstno) {
		this.gstno = gstno;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Map<String, Double> getMenu() {
		return menu;
	}
	public void setMenu(Map<String, Double> menu) {
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", loc=" + loc + ", gstno=" + gstno + ", rating=" + rating + ", menu=" + menu
				+ "]";
	}
	
}
