package designpatter.command;

public class ACRemoteMain {
	
	public static void main(String []args) throws InterruptedException {
	AC ac1 = new AC();
	AcComamnd comand = () -> ac1.turnOn();
	AcComamnd offCommand = () -> ac1.turnOff();
	
	RemoteControl remoteControl = new RemoteControl();
	remoteControl.setCommand(comand);
	remoteControl.buttonPressed();
	
	Thread.sleep(1000);
	
	remoteControl.setCommand(offCommand);
	remoteControl.buttonPressed();
	
	
	}
}
