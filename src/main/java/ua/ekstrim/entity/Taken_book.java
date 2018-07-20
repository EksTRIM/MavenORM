package ua.ekstrim.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "taken_book")
public class Taken_book extends BaseEntity{



    @Column(name = "date_from", nullable = false)
    private String dateFrom;

    @Column(name = "date_to", nullable = false)
    private String dateTo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;


}
