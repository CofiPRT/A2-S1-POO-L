
public class MainClass {

	public static void main(String[] args) {
		// TASK 1
		MessageSet myInbox = new MessageSet();
		myInbox.addMessage("I would like fish with rice, please");
		
		myInbox.registerObserver(new RomanianObserver());
		myInbox.addMessage("I said, I would like fish with rice, please!");
		
		myInbox.registerObserver(new SpanishObserver());
		myInbox.addMessage("CAN A MAN EAT A FISH OVER HERE?!");

		// TASK 2
		Invoker myInv = new Invoker();
		
		Image myImage = new Image();
		
		ImageCommand command1 = new ResizeCommand(myImage).setNewHeight(100).setNewWidth(200);
		ImageCommand command2 = new RotateCommand(myImage);
		ImageCommand command3 = new BlurCommand(myImage);
		
		myImage.print();
		
		myInv.execute(command1);
		myImage.print();
		
		myInv.undo();
		myImage.print();
		
		myInv.redo();
		myInv.execute(command2);
		myImage.print();
		
		myInv.execute(command3);
		myImage.print();
		
		myInv.undo();
		myInv.undo();
		myInv.undo();
		myImage.print();
		 
		
	}

}
