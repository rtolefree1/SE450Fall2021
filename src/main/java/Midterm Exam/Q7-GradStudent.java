/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package Q7;

import java.util.LinkedHashSet;

public class GradStudent extends Student{
	private String advisor;

	public GradStudent(String name, int year, String advisor) {
		super(name, year);
		this.advisor=advisor;
	}
	
	@Override
	public int getYear() {
		
		return super.getYear()+4;
	}
	
	
	@Override
	public void addCourse(String name) {
		if (super.getCourseCount()<6) {
			super.addCourse(name);
		}
		
	}
	
	@Override
	public double getTuition() {
		if(super.getCourseCount()>1) {
			return 2900;
		}
		return 1000;
	}
	
	public String getAdvisor() {
		return this.advisor;
	}
	
	public boolean isBurntOut() {
		if (super.getYear()>=8 || super.getCourseCount()>=5) {
			return true;
		}
		return false;
	}
	
}


