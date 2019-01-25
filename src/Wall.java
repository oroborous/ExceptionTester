public class Wall {
    private double width;
    private double height;
    
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() throws Exception {
        //return height;
        return Double.parseDouble("Hello");

    }
    
    public double getArea() {
        double area = 0;
        try {
         area =  getWidth() * getHeight();
        
        } catch (Exception e) {
            System.out.println("Oops");
        }
        return area;
    }
}
