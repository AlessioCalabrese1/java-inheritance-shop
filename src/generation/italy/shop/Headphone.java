package generation.italy.shop;

public class Headphone extends Product {
    private String color;
    private boolean isWireless;

    public Headphone(int code, String name, String brand, float price, int iva, String color, Boolean isWireless){
        super(code, name, brand, price, iva);
        setColor(color);
        setWireless(isWireless);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + getColor() + "\nWireless: " 
        + (isWireless() == true ? "supported" : "not supported");
    }
}
