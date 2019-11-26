package pe.miachel.springcore.example12;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncCommand {
	private final Logger logger = LoggerFactory.getLogger(AsyncCommand.class);
	private final Timestamp createdTime;
	
	public AsyncCommand() {
		logger.info("AsyncCommand[" + this.toString() + "]");
		this.createdTime = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}
}
