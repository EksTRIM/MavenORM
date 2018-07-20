package ua.ekstrim.entity;



import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "address")
public class Address extends BaseEntity{




    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @Column(name = "city", nullable = false,length = 80)
    private String city;

    @Column(name = "street", nullable = false, length = 120)
    private String street;

    @Column(name = "house_number", nullable = false)
    private String houseNumber;

    @Column(name = "apartment_number", nullable = false)
    private String apartmentNumber;
}
