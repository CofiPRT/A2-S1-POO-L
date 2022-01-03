
public class ResizeCommand extends ImageCommand {
	public double prevHeight;
	public double prevWidth;
	public double newHeight;
	public double newWidth;
	
	public ResizeCommand(Image image) {
		super(image);
	}
	
	public void execute() {
		prevHeight = currImage.getHeight();
		prevWidth = currImage.getWidth();
		
		currImage.setHeight(newHeight).setWidth(newWidth);
	}
	
	public void undo() {
		currImage.setHeight(prevHeight).setWidth(prevWidth);
	}

	public double getNewHeight() {
		return newHeight;
	}

	public ResizeCommand setNewHeight(double newHeight) {
		this.newHeight = newHeight;
		
		return this;
	}

	public double getNewWidth() {
		return newWidth;
	}

	public ResizeCommand setNewWidth(double newWidth) {
		this.newWidth = newWidth;
		
		return this;
	}
	
	
}
