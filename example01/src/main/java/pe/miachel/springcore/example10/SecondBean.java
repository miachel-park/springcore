package pe.miachel.springcore.example10;

import java.sql.Timestamp;

public class SecondBean {
	final private Timestamp createdTime;

	public SecondBean() {
		super();
		createdTime = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}
	
}
