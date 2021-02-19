import java.io.IOException;

public abstract class MLExecutor {
	
	protected ConfigurationML configuration;
	protected boolean withDocker;
	
	public abstract void generateCode() throws IOException;
	public abstract MLResult run() throws IOException;
	
	public boolean withDocker() {
		return withDocker;
	}

}
