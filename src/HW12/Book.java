package HW12;

public class Book {
    private String bookName;
    private int bookYear;
    private Author bookAuthor;

    public Book(String bookName, int bookYear, Author bookAuthor) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.bookAuthor = bookAuthor;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookName() {
        this.bookName = bookName;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String toString() {
        return "Книга - " + bookName + ", год издания - " + bookYear + ", автор - " + getBookAuthor().getAuthorFirstName() + " " + getBookAuthor().getAuthorLastName();
    }
}
