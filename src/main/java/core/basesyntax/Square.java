package core.basesyntax;

public class Square extends Figure implements Drawing , AreaCalculator {
    private int sides;

    public Square(int sides, Colors colors) {
        this.sides = sides;
        this.setColor(colors);
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    @Override
    public double calculateArea() {
        return sides * sides;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Square , area is " + this.calculateArea() + " sq. units, sides: " +  getSides()  + " units, color: " + getColor();
    }































































    
    
    
    
    
    
    
    
    
    
    
    
    

}
