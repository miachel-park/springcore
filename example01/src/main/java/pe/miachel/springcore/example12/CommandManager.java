package pe.miachel.springcore.example12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CommandManager {
	private final Logger logger = LoggerFactory.getLogger(CommandManager.class);
	private AsyncCommand command;
	
	protected abstract AsyncCommand createCommand();
}
