package inter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("j")
public class JurassicPark {
	@Autowired
	@Qualifier("gg")
	private Dinosaur d1;
	@Autowired
	@Qualifier("tt")
	private Dinosaur d2;
	void getDinosaurSound() {
		d1.Sound();
		d2.Sound();
	}

}
