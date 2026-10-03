package constructorinj;

import java.util.Set;

public class Hotel {
	private String hname;
	private String loc;
	private Set<String> menu;
	public Hotel(String hname, String loc, Set<String> menu) {
		super();
		this.hname = hname;
		this.loc = loc;
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "Hotel [hname=" + hname + ", loc=" + loc + ", menu=" + menu + "]";
	}
	

}
