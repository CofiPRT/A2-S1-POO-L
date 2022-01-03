import java.util.ArrayList;

public class Invoker {
	public ArrayList<ImageCommand> commands;
	int index = 0;
	
	public Invoker() {
		commands = new ArrayList<>();
	}
	
	public void execute(ImageCommand comm) {
		comm.execute();
		commands.add(comm);
		index++;
	}
	
	public void undo() {
		commands.get(--index).undo();
	}
	
	public void redo() {
		commands.get(index++).execute();
	}
}
