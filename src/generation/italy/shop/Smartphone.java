package generation.italy.shop;

public class Smartphone extends Product{
    private int imeiCode;
    private int memory;
    
    public Smartphone(int code, String name, String brand, float price, int iva, int imeiCode, int memory){
        super(code, name, brand, price, iva);
        setImeiCode(imeiCode);
        setMemory(memory);
    }

    public int getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImei Code: " + getImeiCode() + "\nMemory: " + memory;
    }
}
