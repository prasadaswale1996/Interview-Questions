package spring.core.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	String name;
	int roll;
	@Autowired
	@Qualifier("addr2")
	Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll, Address addr) {
		super();
		this.name = name;
		this.roll = roll;
	}
//	Autowired constructor
	public Student(Address addr) {
		super();
		System.out.println("autowired constructor...");
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAddr() {
		return addr;
	}
//	Autowired
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", addr=" + addr + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
