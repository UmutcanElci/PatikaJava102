package PatikaStore.Brand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Brands {
    private static int idCount = 1;
    private int id;
    private String name;
    private static List<Brands> brands = new ArrayList<>();

    public Brands() {
    }

    public Brands(String name) {
        this.name = name;
        this.id = idCount;
        idCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
  public void printBrands(){
      Collections.sort(brands, new Comparator<Brands>() {
          @Override
          public int compare(Brands o1, Brands o2) {
              return o1.getName().compareTo(o2.getName());
          }
      });
      for (Brands b : brands){
          System.out.println(b.getName());
      }
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Brands getBrandById(int id){
        for (Brands b : brands){
            if (id == b.getId()){
                return b;
            }
        }
        return new Brands("Markasız");
    }
    public List<Brands> getBrands() {
        return brands;
    }

    public void setBrands(List<Brands> brands) {
        this.brands = brands;
    }
}
