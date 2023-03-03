package PatikaStore.Product;

import PatikaStore.Brand.Brands;
import java.util.*;

public class Prodcuts{
    private String productName;
    private int productPrice;
    private int salePercent;
    private int stock;
    private int productId;
    private static int productIdCount;
    private static Brands brand;
    //private static List<Brands> brands = new ArrayList<>();
    private static TreeSet<Brands> brands = new TreeSet<>(new Comparator<Brands>() {
        @Override
        public int compare(Brands o1, Brands o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public Prodcuts(String productName, int productPrice, int salePercent, int stock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.salePercent = salePercent;
        this.stock = stock;
        this.productId = productIdCount;
        productIdCount++;
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

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public static int getProductIdCount() {
        return productIdCount;
    }

    public static void setProductIdCount(int productIdCount) {
        Prodcuts.productIdCount = productIdCount;
    }

    public TreeSet<Brands> getBrands() {
        return brands;
    }

    public void setBrands(TreeSet<Brands> brands) {
        Prodcuts.brands = brands;
    }
}
