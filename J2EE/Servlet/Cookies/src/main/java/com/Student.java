package com;

public class Student {
	public int id;
	public String name;
	public Student(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Studend [id=" + id + ", name=" + name + "]";
	}
	

}
