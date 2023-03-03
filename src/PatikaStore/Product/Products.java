package PatikaStore.Product;

import PatikaStore.Brand.Brands;
import com.sun.source.tree.Tree;

import java.util.*;

public class Products {
    private String productName;
    private int productPrice;
    private int salePercent;
    private int stock;
    private int productId;
    private static int productIdCount;
    private int productStorage;
    private double inc;
    private int ram;
    private Brands brand;
    Scanner in = new Scanner(System.in);
    //private static List<Brands> brands = new ArrayList<>();
    private static TreeSet<Brands> brands = new TreeSet<>(new Comparator<Brands>() {
        @Override
        public int compare(Brands o1, Brands o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public Products(String productName, int productPrice, int salePercent, int stock, int productStorage, double inc, int ram, Brands brand) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.salePercent = salePercent;
        this.stock = stock;
        this.productId = productIdCount;
        this.productStorage = productStorage;
        this.inc = inc;
        this.ram = ram;
        this.brand = brand;
        productIdCount++;
    }

    public Products() {
    }


    static {
        brands.add(new Brands("Samsung"));
        brands.add(new Brands("Lenovo"));
        brands.add(new Brands("Apple"));
        brands.add(new Brands("Huawei"));
        brands.add(new Brands("Casper"));
        brands.add(new Brands("Asus"));
        brands.add(new Brands("HP"));
        brands.add(new Brands("Xiaomi"));
        brands.add(new Brands("Monster"));
    }
    public String getProductName() {
        return productName;
    }

    public  Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(int salePercent) {
        this.salePercent = salePercent;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public TreeSet<Brands> getBrands() {
        return brands;
    }

    public void setBrands(TreeSet<Brands> brands) {
        this.brands = brands;
    }
    public Brands getBrandById(int id){
        for (Brands b : brands){
            if (id == b.getId()){
                return b;
            }
        }
        return null;
    }
    public void addBrand(){
        System.out.println("Enter Brand name : ");
        String brandName = in.next();
        brands.add(new Brands(brandName));
    }
}
