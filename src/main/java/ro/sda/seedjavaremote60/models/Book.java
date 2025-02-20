package ro.sda.seedjavaremote60.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class Book {
    @NotNull
    @Length(min = 2, message = "The book title must have at least 2 characters")
    private String title;

    private int publishedYear;
    private Author author;

    @NotNull
    @Min(value = 10, message = "The book must have at least 10 pages")
    private int noOfPages;
}
