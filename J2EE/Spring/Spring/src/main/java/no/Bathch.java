package no;

import java.util.List;

public class Bathch {
	private String bcode;
	private String subject;
	private String timing;
	private int roomno;
	private List<String> stdName;
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public List<String> getStdName() {
		return stdName;
	}
	public void setStdName(List<String> stdName) {
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "Bathch [bcode=" + bcode + ", subject=" + subject + ", timing=" + timing + ", roomno=" + roomno
				+ ", stdName=" + stdName + "]";
	}
	

}
