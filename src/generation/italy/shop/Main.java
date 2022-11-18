package generation.italy.shop;

public class Main {
    public static void main(String[] args) {
        Product prd = new Product(1, "Calze", "Adidas", 6, 20);
        System.out.println(prd);
        System.out.print("------------------------------------");
        Product smr = new Smartphone(2, "Oneplus 9+", "Oneplus", 600, 20,  111, 256);
        System.out.println(smr);
        System.out.print("------------------------------------");
        
    }
}
