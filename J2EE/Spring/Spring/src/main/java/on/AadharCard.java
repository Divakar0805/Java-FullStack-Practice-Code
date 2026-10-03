package on;

public class AadharCard {
	private long ano;
	private String dob;
	private String address;
	private int pincode;
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AadharCard [ano=" + ano + ", dob=" + dob + ", address=" + address + ", pincode=" + pincode + "]";
	}
	

}
