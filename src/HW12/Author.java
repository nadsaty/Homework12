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

    //Применение метода equals()
    public boolean equals(Object obj) {
        Author otherAuthor = (Author) obj;
        return this.authorFirstName == otherAuthor.authorFirstName;
    }

    public int hashCode() {
        return java.util.Objects.hash(authorFirstName, authorLastName);
    }
}
