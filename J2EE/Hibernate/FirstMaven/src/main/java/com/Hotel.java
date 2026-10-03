package com;
import jakarta.persistence.*;

@Entity
public class Hotel {
	@Id
	private int fid;
	private String ftype;
	private String fname;
	private String fvarient;
	private Double fprice;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFvarient() {
		return fvarient;
	}
	public void setFvarient(String fvarient) {
		this.fvarient = fvarient;
	}
	public Double getFprice() {
		return fprice;
	}
	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}
	@Override
	public String toString() {
		return "Hotel [fid=" + fid + ", ftype=" + ftype + ", fname=" + fname + ", fvarient=" + fvarient + ", fprice="
				+ fprice + "]";
	}
	
	
}
