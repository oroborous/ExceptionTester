public class PaintCalculator {
    public static void main(String[] args) {
        new PaintCalculator();
    }
    
    public PaintCalculator() {
        Room room = new Room(10,8,9);
        try {
            System.out.println(room.getArea());
        }
        catch (NumberFormatException e){
            System.out.println("You did a bad thing");
        }
    }
}
