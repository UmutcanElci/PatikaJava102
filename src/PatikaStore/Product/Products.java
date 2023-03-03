package PatikaStore.Product;

import PatikaStore.Brand.Brands;

public abstract class Products{
private String name;
private Brands brands;
private int price;
private int amount;
private int discountValue;
private double inch;
private int ram;
private int memory;

    public Products() {
    }

    public Products(String name, Brands brands, int price, int amount, int discountValue, double inch, int ram, int memory) {
        this.name = name;
        this.brands = brands;
        this.price = price;
        this.amount = amount;
        this.discountValue = discountValue;
        this.inch = inch;
        this.ram = ram;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(int discountValue) {
        this.discountValue = discountValue;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
