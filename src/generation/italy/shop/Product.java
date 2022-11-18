package generation.italy.shop;

public class Product {
    private int code;
    private String name;
    private String brand;
    private double price;
    private int iva;

    public Product(int code, String name, String brand, double price, int iva){
        setCode(code);
        setName(name);
        setBrand(brand);
        setPrice(price);
        setIva(iva);
    }

    private void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getIvaPrice(){
        double ivaPrice = price + ((price * iva) / 100);
        return ivaPrice;
    }
    
    @Override
    public String toString() {
        return "Code: " + getCode() + "\nName: " + getName() + "\nBrand: " + getBrand() + "\nPrice: " 
        + getPrice() + "\nPrice with Iva: " + getIvaPrice();
    }
}
