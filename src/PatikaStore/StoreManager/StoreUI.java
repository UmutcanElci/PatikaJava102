package PatikaStore.StoreManager;

import PatikaStore.Brand.Brands;
import PatikaStore.Product.Prodcuts;


public class StoreUI implements IStoreManager {

    @Override
    public void printBrands() {
       Prodcuts prodcuts = new Prodcuts();
       for (Brands brands : prodcuts.getBrands()){
           System.out.println(brands.getName());
       }
    }

    @Override
    public void ListNoteBooks() {

    }

    @Override
    public void ListPhones() {

    }
}
