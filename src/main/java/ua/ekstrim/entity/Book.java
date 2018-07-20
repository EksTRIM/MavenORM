package ua.ekstrim.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "book")
public class Book extends BaseEntity{


    @Column(name = "isbn", nullable = false, unique = true, length = 50)
    private String isbn;

    @Column(name = "book_name", nullable = false, length = 150)
    private String bookName;

    @Column(name = "date_of_publication", nullable = false)
    private String dateOfPublication;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    @OneToMany(mappedBy = "book")
    private List<Taken_book> taken_books;
}
