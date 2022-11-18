package generation.italy.shop;

public class Product {
    private int code;
    private String name;
    private String brand;
    private float price;
    private int iva;

    public Product(int code, String name, String brand, float price, int iva){
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public float getIvaPrice(){
        float ivaPrice = price + ((price * iva) / 100);
        return ivaPrice;
    }
    
    @Override
    public String toString() {
        return "Code: " + code + "\nName: " + name + "\nBrand: " + brand + "\nPrice: " + price + "\nPrice with Iva: " + getIvaPrice();
    }
}
