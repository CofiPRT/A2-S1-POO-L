
public class BlurCommand extends ImageCommand {
	public boolean prevBlurred;
	
	public BlurCommand(Image image) {
		super(image);
	}
	
	public void execute() {
		prevBlurred = currImage.isBlurred();
		
		currImage.setBlurred(true);
	}
	
	public void undo() {
		currImage.setBlurred(prevBlurred);
	}
}
