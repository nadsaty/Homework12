package HW12;

public class Main {
    public static void main(String[] args) {

        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book ("Война и мир", 1886, levTolstoy);
        System.out.println("Книга - " + warAndPeace.getBookName() + ", " + warAndPeace.getBookYear() + " год, " + warAndPeace.getBookAuthor().getAuthorFirstName() + " " + warAndPeace.getBookAuthor().getAuthorLastName());

        Author fedorDostoevsky = new Author("Федор", "Достоевский");
        Book idiot = new Book("Бесы", 1872, fedorDostoevsky);
        System.out.println("Книга - " + idiot.getBookName() + ", " + idiot.getBookYear() + " год, " + idiot.getBookAuthor().getAuthorFirstName() + " " + idiot.getBookAuthor().getAuthorLastName());

        warAndPeace.setBookYear(1869);
        System.out.println("\n *поправка: год издания книги 'Война и мир' - " + warAndPeace.getBookYear());
    }
}