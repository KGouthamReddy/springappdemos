package com.samples.S01springcoredi;

import java.util.Set;

public class Actors {
	private String studio;
	private Set<String> actorname;
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public Set<String> getActorname() {
		return actorname;
	}
	public void setActorname(Set<String> actorname) {
		this.actorname = actorname;
	}
	@Override
	public String toString() {
		return "Actors [studio=" + studio + ", actorname=" + actorname + "]";
	}
	
	
}
