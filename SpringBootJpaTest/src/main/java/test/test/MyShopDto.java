package test.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "myshop")
public class MyShopDto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;
    @Column
    private String sangname;
    @Column
    private String sangprice;
    @Column
    private String sangcolor;
    @Column
    private String sangipgo;
    @CreationTimestamp
    private Timestamp writeday;
}
