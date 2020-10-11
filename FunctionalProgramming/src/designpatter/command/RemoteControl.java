package designpatter.command;


public class RemoteControl {

	AcComamnd comamnd;
	
	public void setCommand(AcComamnd command) {
		this.comamnd = command;
	}
	public void buttonPressed() {
		comamnd.execute();
	}
}
