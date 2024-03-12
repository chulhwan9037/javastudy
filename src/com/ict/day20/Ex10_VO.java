package com.ict.day20;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 객체의 정보를 담을 수 있는 멤버 변수로 구성
	// 2. Externalizable 인터페이스 구현 (추상메서드)
public class Ex10_VO implements Externalizable {
	// transient 이게 안되네 Externalizable 에서는
	private String name;
	private int age;
	private double weight;
	private boolean gender ;
	
	public Ex10_VO() { }
	
	public Ex10_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	// 직렬화 대상 넣기 (write)
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 제외 시키려면 write, read 에서 모두 빼야한다. 순서도 맞춰야한다. 
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}
	
	// 역직렬화 대상 넣기 (read)
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 순서도 같게 하자.
		name = (String) in.readObject();
		age = (int) in.readObject();
		weight = (double) in.readObject();
		gender = (boolean) in.readObject();
	}
	
	
	// get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
