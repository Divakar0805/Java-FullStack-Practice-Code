package scanner;

public interface Intrest {
	double calculateIntrest(double p,double t,double r);
}
class SimpleIntrest implements Intrest{
	@Override
	public double calculateIntrest(double p,double t,double r){
		return(p*t*r)/100;
	}
}
class CompoundIntrest implements Intrest {
	@Override
	public double calculateIntrest(double p,double t,double r) {
		return p*(Math.pow((1+r/100),t)-1);
	}
}
