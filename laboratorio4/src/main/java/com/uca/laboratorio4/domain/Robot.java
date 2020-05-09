package com.uca.laboratorio4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Sos robot prro >:v")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
	
}
