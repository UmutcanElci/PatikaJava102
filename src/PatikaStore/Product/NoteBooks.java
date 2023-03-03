package PatikaStore.Product;

import PatikaStore.Brand.Brands;

import java.util.ArrayList;
import java.util.List;

public class NoteBooks extends Products{
    List<NoteBooks> noteBooks = new ArrayList<>();
    private int noteBookId;
    private int noteBookIdCount = 1;

    public NoteBooks() {
    }

    public NoteBooks(String name, Brands brands, int price, int amount, int discountValue, double inch, int ram, int memory) {
        super(name, brands, price, amount, discountValue, inch, ram, memory);

        this.noteBookId = noteBookIdCount;
        noteBookIdCount++;
    }

    public void add(){
        noteBooks.add(new NoteBooks("HUAWEI Matebook 14",Brands.getBrandById(4),7000,100,10,14.0,16,512));
        for (NoteBooks noteBooks1 : noteBooks){
            
            System.out.println("| "+noteBooks1.getNoteBookId()+" | "+noteBooks1.getName()+" \t|"+noteBooks1.getPrice()+" TL| "+noteBooks1.getBrands().getName()+" | "+noteBooks1.getMemory()+" | "+noteBooks1.getInch()+" | "+noteBooks1.getRam()+" \t|");
        }

    }



    public int getNoteBookId() {
        return noteBookId;
    }

    public void setNoteBookId(int noteBookId) {
        this.noteBookId = noteBookId;
    }
}
