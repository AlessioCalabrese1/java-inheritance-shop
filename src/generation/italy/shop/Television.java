package generation.italy.shop;

public class Television extends Product {
    private float length;
    private float height;

    public Television(int code, String name, String brand, float price, int iva, float length, float height){
        super(code, name, brand, price, iva);
        setLength(length);
        setHeight(height);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLength: " + getLength() + " cm\nHeight: " + getHeight() + " cm";
    }
}
