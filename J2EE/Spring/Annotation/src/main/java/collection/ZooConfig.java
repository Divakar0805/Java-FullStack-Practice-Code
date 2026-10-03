package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ZooConfig {
	@Bean
	@Qualifier("a1")
	public List<String> m1(){
		ArrayList<String> a=new ArrayList<>();
		a.add("Monkey");
		a.add("Snake");
		a.add("Eagle");
		a.add("Parret");
		a.add("Frog");
		return a;
	}
	@Bean
	@Qualifier("a2")
	public List<String> m2(){
		ArrayList<String> a=new ArrayList<>();
		a.add("Lion");
		a.add("Tiger");
		a.add("Elephant");
		return a;
	}
	@Bean
	@Qualifier("t2")
	public Set<Integer> no(){
		HashSet<Integer> h1=new HashSet<>();
		h1.add(101);
		h1.add(102);
		h1.add(103);
		h1.add(104);
		return h1;
	}
	@Bean
	@Qualifier("t1")
	public Map<String,Double> t1(){
		HashMap<String,Double> m=new HashMap<>();
		m.put("Kids", 50.0);
		m.put("Adults", 100.0);
		return m;
		
	}
}
