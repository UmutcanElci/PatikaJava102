package PatikaStore.StoreManager;

import PatikaStore.Brand.Brands;
import PatikaStore.Product.NoteBooks;

public interface IStoreManager {
    Brands brands = new Brands();
    NoteBooks noteBooks = new NoteBooks();
    public void printBrands();
    public void ListNoteBooks();
    public void addNoteBooks();
    public void deleteNoteBookById();
    public void findNoteBookById();
    public void ListPhones();

}
