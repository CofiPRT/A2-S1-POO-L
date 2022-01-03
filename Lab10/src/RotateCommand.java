
public class RotateCommand extends ImageCommand {
	public double prevRotation;
	
	public RotateCommand(Image image) {
		super(image);
	}
	
	public void execute() {
		prevRotation = currImage.getRotation();
		
		currImage.setRotation(prevRotation + 90);
	}
	
	public void undo() {
		currImage.setRotation(prevRotation);
	}
}
