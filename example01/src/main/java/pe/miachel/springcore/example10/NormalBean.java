package pe.miachel.springcore.example10;

import java.sql.Timestamp;

public class NormalBean {
	final private Timestamp createdTime;

	public NormalBean() {
		super();
		createdTime = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}
	
}
