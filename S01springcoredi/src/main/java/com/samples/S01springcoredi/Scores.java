package com.samples.S01springcoredi;

public class Scores {
	private int math;
	private int pyhsics;
	private int chemistry;
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getPyhsics() {
		return pyhsics;
	}
	public void setPyhsics(int pyhsics) {
		this.pyhsics = pyhsics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "Scores [math=" + math + ", pyhsics=" + pyhsics + ", chemistry=" + chemistry + "]";
	}
	
}
