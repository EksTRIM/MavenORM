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
@Table(name = "author")
public class Author extends BaseEntity{


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;


    @ManyToMany
    @JoinTable(name = "author_book",
    joinColumns = @JoinColumn(name = "author_id"),
    inverseJoinColumns =@JoinColumn(name = "book_id"))
    private List<Book> books;
}
