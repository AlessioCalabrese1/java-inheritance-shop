package generation.italy.shop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {
        int code = 0;
        String name;
        String brand;
        float price;
        int iva = 20;
        int imeiCode;
        int memory;
        float length;
        float height;
        String color;
        Boolean isWireless = true;

        boolean isTrue = true;
        List<Product> catalog = new LinkedList<>();
        Scanner sn = new Scanner(System.in);
        
        while (isTrue) {
            System.out.println("Si desidera inserire un prodotto? (s/n)");
            // Turn Around per colpa di un bug che avviene quando si fa una nextLine dopo una nextInt
            if (code != 0) {
                sn.nextLine();
            }
            String scan = sn.nextLine();

            if (!scan.equals("s")) {
                isTrue = false; 
                System.out.println("Buona Giornata!");
            }else{
                System.out.println("Inserire il tipo di prodotto (Smartphone, Television, Headphone): ");
                String prodType = sn.nextLine();
                if (prodType.toLowerCase().matches("smartphone")) {
                    code++;
                    System.out.println("Inserire il nome:");
                    name = sn.nextLine();
                    System.out.println("Inserire il brand: ");
                    brand = sn.nextLine();
                    System.out.println("Inserire il prezzo");
                    price = sn.nextFloat();
                    System.out.println("Inserire IMEI code:");
                    imeiCode = sn.nextInt();
                    System.out.println("Inserire la quantità di memoria");
                    memory = sn.nextInt();
                    Product smr = new Smartphone(code, name, brand, price, iva, imeiCode, memory);
                    catalog.add(smr);
                }else if(prodType.equals("television")){
                    code++;
                    System.out.println("Inserire il nome:");
                    name = sn.nextLine();
                    System.out.println("Inserire il brand: ");
                    brand = sn.nextLine();
                    System.out.println("Inserire il prezzo");
                    price = sn.nextFloat();
                    System.out.println("Inserire la lunghezza in cm: ");
                    length = sn.nextFloat();
                    System.out.println("Inserire l'altezza in cm");
                    height = sn.nextFloat();
                    Product tel = new Television(code, name, brand, price, iva, length, height);
                    catalog.add(tel);
                }else if(prodType.equals("headphone")){
                    code++;
                    System.out.println("Inserire il nome:");
                    name = sn.nextLine();
                    System.out.println("Inserire il brand: ");
                    brand = sn.nextLine();
                    System.out.println("Inserire il prezzo");
                    price = sn.nextFloat();
                    System.out.println("Inserire il colore delle cuffie: ");
                    color = sn.nextLine();
                    boolean isX = true;
                    while (isX) {
                        System.out.println("Sono wireless? (s/n)");
                        String x = sn.nextLine();
                        if (x.toLowerCase().equals("s")) {
                            isWireless = true;
                            isX = false;
                        }else if(x.toLowerCase().equals("n")){
                            isWireless = false;
                            isX = false;
                        }else{
                            isX = true;
                        }
                    }
                    Product hpn = new Headphone(code, name, brand, price, iva, color, isWireless);
                    catalog.add(hpn);
                }else{
                    isTrue = true;
                    System.out.println("Il tipo di prodotto inserito non è tra quelli possibili! Riprovare");
                }
            }
        }
        sn.close();
        if(!catalog.isEmpty()){
            System.out.println(catalog);
            System.out.print("------------------------------------\n");
        }
    }
}