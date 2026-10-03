package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("z")
public class Zoo {
	@Value("Ariner Anna")
	private String name;
	@Value("Vandalur")
	private String loc;
	@Value("100")
	private double entryfee;
	@Autowired
	@Qualifier("a1")
	private List<String> animals1;
	@Autowired
	@Qualifier("a2")
	private List<String> animal2;
	@Autowired
	@Qualifier("t2")
	private Set<Integer> ticketno;
	@Autowired
	@Qualifier("t1")
	private Map<String,Double> typefee;
	@Override
	public String toString() {
		return "Zoo [name=" + name + ", loc=" + loc + ", entryfee=" + entryfee + ", animals1=" + animals1 + ", animal2="
				+ animal2 + ", ticketno=" + ticketno + ", typefee=" + typefee + "]";
	}
	
	
	
	

}
