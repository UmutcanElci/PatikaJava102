package PatikaStore.Product;

import PatikaStore.Brand.Brands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBooks extends Products{
    private static int noteBookIdCount = 1;
    List<NoteBooks> noteBooks = new ArrayList<>();
    private int noteBookId;
    Scanner in = new Scanner(System.in);


    public NoteBooks() {
        add();
    }

    public NoteBooks(String name, Brands brands, int price, int amount, int discountValue, double inch, int ram, int memory) {
        super(name, brands, price, amount, discountValue, inch, ram, memory);

        this.noteBookId = noteBookIdCount;
        noteBookIdCount++;
    }

    public void add(){
        noteBooks.add(new NoteBooks("HUAWEI Matebook 14",Brands.getBrandById(4),7000,100,10,14.0,16,512));
        noteBooks.add(new NoteBooks("LENOVO V14 IGL",Brands.getBrandById(2),3699,12,2,14.0,8,1024));
        noteBooks.add(new NoteBooks("ASUS Tuf Gaming",Brands.getBrandById(6),8199,5,7,15.6,32,2048));
    }

    public void listNoteBooks(){
        for (NoteBooks noteBooks1 : noteBooks){

            System.out.println("| "+noteBooks1.getNoteBookId()+" | "+noteBooks1.getName()+" \t|"+noteBooks1.getPrice()+" TL| "+noteBooks1.getBrands().getName()+" | "+noteBooks1.getMemory()+" | "+noteBooks1.getInch()+" | "+noteBooks1.getRam()+" \t|");
        }
    }

    public void deleteById(){
        while (true) {
            try {
                System.out.println("Silmek istediğiniz Notebook ürününün ID sini giriniz : ");
                int id = in.nextInt();
                noteBooks.remove(id+1);
                System.out.println("silinmiştir");
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Yanlış bir ID girdiniz");
            }
        }


    }
    public int getNoteBookId() {
        return noteBookId;
    }

    public void listById() {
            System.out.println("Listelemek istediğiniz ürünün ID sini giriniz : ");
            int id = in.nextInt();
            for (NoteBooks noteBooks1 : noteBooks) {
                if (id+1 == noteBookId) {
                    System.out.println("| " + noteBooks1.getNoteBookId() + " | " + noteBooks1.getName() + " \t|" + noteBooks1.getPrice() + " TL| " + noteBooks1.getBrands().getName() + " | " + noteBooks1.getMemory() + " | " + noteBooks1.getInch() + " | " + noteBooks1.getRam() + " \t|");
                }else {
                    break;
                }
            }
    }

    public void addNoteBook(){
        System.out.println("Notebook adı : ");
        String name = in.next();
        System.out.println("Notebook fiyatı : ");
        int price = in.nextInt();
        System.out.println("Notebook markası : ");
        int brandId = in.nextInt();
        System.out.println("Notebook depolama : ");
        int memory = in.nextInt();
        System.out.println("Notebook inç : ");
        double inch = in.nextDouble();
        System.out.println("Notebook ram : ");
        int ram = in.nextInt();
        System.out.println("Notebook stok :");
        int stok = in.nextInt();
        System.out.println("Notebook indirim yüzde : ");
        int indirim = in.nextInt();
        noteBooks.add(new NoteBooks(name,Brands.getBrandById(brandId),price,stok,indirim,inch,ram,memory));
    }


}
