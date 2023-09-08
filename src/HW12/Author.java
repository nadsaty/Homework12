package HW12;

import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author (String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName () {
        return this.authorFirstName;
    }

    public String getAuthorLastName () {
        return this.authorLastName;
    }

    public void setAuthorFirstName () {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorLastName () {
        this.authorLastName = authorLastName;
    }

    //Применение методов equals() и hashCode() вручную:

    /* public boolean equals(Object obj) {
        Author otherAuthor = (Author) obj;
        return this.authorFirstName.equals(otherAuthor.authorFirstName) && this.authorLastName.equals(otherAuthor.authorLastName);
    }
    public int hashCode() {
        return java.util.Objects.hash(authorFirstName, authorLastName);
    } */


    //Сгенерированные методы equals() и hashCode():
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLastName, author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}
