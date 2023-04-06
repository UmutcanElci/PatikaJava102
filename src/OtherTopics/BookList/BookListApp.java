package OtherTopics.BookList;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.*;

public class BookListApp {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();



        books.add(new Book("Crowley", 57, "Benny Gadman", "8/26/2009"));
        books.add(new Book("Division", 92, "Darius Siviter", "9/3/1993"));
        books.add(new Book("Bowman", 230, "Daniel Schlag", "9/3/1993"));
        books.add(new Book("Westport", 53, "Conan Grimsdith", "9/3/1993"));
        books.add(new Book("Manley", 182, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Straubel", 21, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Park Meadow", 400, "Julita Matchell", "9/3/1993"));
        books.add(new Book("Loftsgordon", 87, "Julita Matchell", "9/3/1993"));
        books.add(new Book("International", 214, "Julita Matchell", "9/3/1993"));



        Map<String , String> map = new TreeMap<>();
        books.stream().forEach(book -> map.put(book.getName(),book.getAuthor()));

        ArrayList<Book> list  = new ArrayList<>();
        books.stream().filter(book -> book.getPage()>100).forEach(book -> list.add(book));
        list.stream().forEach(book -> System.out.println(book.getName()));

    }

}
