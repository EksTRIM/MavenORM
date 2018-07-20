package ua.ekstrim.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "full_name",nullable = false, length = 50)
    private String fullName;

    @Column(name = "phone_number",nullable = false, unique = true, length = 15)
    private int phoneNumber;

    @Column(name = "email",nullable = false,unique = true, length = 50 )
    private String email;

    @Column(name = "birthday", nullable = false, columnDefinition = "text")
    private String birthday;

    @Column(name = "description", columnDefinition = "text")
    private  String description;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Taken_book> taken_books;


}
