package CollectionsVeMapInterface.Odev_KitapSiraliyici;

import com.sun.source.tree.Tree;

import java.util.*;

public class OdevApp {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Algoritma Giriş",450,"Fahri Vatansever",2020));
        books.add(new Book("Kırmızı Pazartesi",112,"Gabriel Garica Marques",1982));
        books.add(new Book("Evren Avucunda",389,"Christophe Galfard",2015));

        for (Book book : books){
            System.out.println(book.getBookName());
        }

        System.out.println("\n-------------------\n");

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()- o2.getPage();
            }
        });

        books1.addAll(books);

        for (Book book: books1){
            System.out.println(book.getBookName());
        }


    }
}
