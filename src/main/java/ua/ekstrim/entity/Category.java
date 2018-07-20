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
@Table(name = "categry")
public class Category extends BaseEntity{




    @Column(name = "category")
    private String category;

}
