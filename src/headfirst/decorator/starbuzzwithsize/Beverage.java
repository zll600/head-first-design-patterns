package headfirst.decorator.starbuzzwithsize;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI};

    String description = "Unknown Beverage";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
