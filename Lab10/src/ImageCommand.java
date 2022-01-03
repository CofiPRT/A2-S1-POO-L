
public abstract class ImageCommand {
	Image currImage;
	
	public ImageCommand(Image image) {
		currImage = image;
	}
	
	public abstract void execute();
	public abstract void undo();
	
	public Image getImage() {
		return currImage;
	}
}
