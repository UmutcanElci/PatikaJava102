package CollectionsVeMapInterface.Odev_KitapSiraliyici;

import java.util.HashSet;
import java.util.Set;

public class Book implements Comparable<Book> {
    private String bookName;
    private int page;
    private String authorName;
    private int publishDate;
    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }

    public Book() {
    }

    public Book(String bookName, int page, String authorName, int publishDate) {
        this.bookName = bookName;
        this.page = page;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}


