package pe.miachel.springcore.example10;

import java.sql.Timestamp;

public class LazyBean {
	final private Timestamp createdTime;

	public LazyBean() {
		super();
		createdTime = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}
	
}
