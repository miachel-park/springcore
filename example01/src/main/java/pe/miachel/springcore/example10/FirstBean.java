package pe.miachel.springcore.example10;

import java.sql.Timestamp;

public class FirstBean {
	final private Timestamp createdTime;

	public FirstBean() {
		super();
		createdTime = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}
}
