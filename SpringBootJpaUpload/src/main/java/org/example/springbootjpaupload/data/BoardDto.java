package org.example.springbootjpaupload.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "jpaboard")
@Data
public class BoardDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long num;

    @Column(updatable = false)
    private String writer;

    @Column
    private String subject;

    @Column
    private String content;

    @Column
    private String photo;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp writeday;
}
