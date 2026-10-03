package has;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
public class Engine {
	@Value("AS3DSDDFD")
	private String eno;
	@Value("petrol")
	private String type;
	@Value("1000cc")
	private String cc;
	@Value("1000rpm")
	private String rpm;
	@Override
	public String toString() {
		return "Engine [eno=" + eno + ", type=" + type + ", cc=" + cc + ", rpm=" + rpm + "]";
	}
	
}
