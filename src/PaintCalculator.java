public class PaintCalculator {
    public static void main(String[] args) {
        new PaintCalculator();
    }
    
    public PaintCalculator() {
        try {
        Room room = new Room(-10,8,9);
        room.getArea();
        } catch (BadWidthException | BadHeightException e){
            System.out.println("No negative dimensions");
        } 
        
    }
}
