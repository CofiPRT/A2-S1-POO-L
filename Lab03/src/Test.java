public class Test {
 
    public static void main(String[] args) {
        Scene newScene = new Scene(4);
        
        Circle newCircle = new Circle("red", true, 3);
        Circle otherCircle = new Circle("orange", false, 4);
        
        Rectangle newRectangle = new Rectangle("yellow", true, 1, 2);
        Rectangle otherRectangle = new Rectangle("green", false, 3, 4);
       
        newScene.add((GeometricObject)newCircle);
        newScene.add((GeometricObject)otherCircle);
        newScene.add((GeometricObject)newRectangle);
        newScene.add((GeometricObject)otherRectangle);
       
        newScene.displayAll();
        System.out.println("Total area of the scene: "
        							+ newScene.areaAll());
        System.out.println("Total perimeter of the scene: "
        							+ newScene.perimeterAll());
        
        newScene.sort();
        newScene.displayAll();
        
        System.out.println(newCircle.getDateCreated());
        System.out.println(otherCircle.getDateCreated());
        System.out.println(newRectangle.getDateCreated());
        System.out.println(otherRectangle.getDateCreated());
        
        Octagon newOct = new Octagon("blue", false, 10);
        Octagon otherOct = (Octagon)newOct.clone();
        
        System.out.println("newOct compared to otherOct: "
        						+ newOct.compareTo(otherOct));
    }
 
}