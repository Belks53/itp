import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Anna", "asda");
        Video video = new Video("dsdse", "afsf");
        Newspaper newspaper = new Newspaper("dsdse", "afsf");
        Library library = new Library();
        library.add(book);
        library.add(video);
        library.add(newspaper);
        Library2 library2 = new Library2();
        library2.add(book);
        library2.add(video);
        library2.add(newspaper);
    }
}

class Media {
    private String title;
    private String author;

    Media(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class Book extends Media {
    Book(String title, String author) {
        super(title, author);
    }
}

class Video extends Media {
    Video(String title, String author) {
        super(title, author);
    }
}

class Newspaper extends Book {
    Newspaper(String title, String author) {
        super(title, author);
    }
}

class Library {
    List<Object> allMedia = new ArrayList<>();
    void add(Object media) {
        allMedia.add(media);

    }
    Object get(int index) {
        return allMedia.get(index);
    }
}

class Library2 <T>{
    List<T> allMedia = new ArrayList<>();
    void add (T obj) {
        allMedia.add(obj);
    }

    T get(int index) {
        return allMedia.get(index);
    }
}