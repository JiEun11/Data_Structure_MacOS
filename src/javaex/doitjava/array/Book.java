package javaex.doitjava.array;

public class Book {
    private String bookName;
    private String author;

    public Book() {} //default constructor

    public Book(String bookName, String author){
        this.bookName = bookName;   // second constructor which has two arguments
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){  // show infomations of book
        System.out.println(bookName + "," + author);
    }
}
