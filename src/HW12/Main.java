package HW12;

public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book ("Война и мир", 1886);
        System.out.println("Книга - " + warAndPeace.getBookName() + ", " + warAndPeace.getBookYear() + " год");

        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println("Автор - " + levTolstoy.getAuthorFirstName() + " " + levTolstoy.getAuthorLastName());

        Book idiot = new Book("Бесы", 1872);
        System.out.println("Книга - " + idiot.getBookName() + ", " + idiot.getBookYear() + " год");

        Author fedorDostoevsky = new Author("Федор", "Достоевский");
        System.out.println("Автор - " + fedorDostoevsky.getAuthorFirstName() + " " + fedorDostoevsky.getAuthorLastName());

        warAndPeace.setBookYear(1869);
        System.out.println("\n *поправка: год издания книги 'Война и мир' - " + warAndPeace.getBookYear());
    }
    //
}