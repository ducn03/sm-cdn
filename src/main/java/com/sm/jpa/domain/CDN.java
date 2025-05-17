package com.sm.jpa.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "U_CDN")
public class CDN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_file")
    private String nameFile;

    @Column(name = "path")
    private String path;

    @Column(name = "full_link")
    private String fullLink;

    @Column(name = "status")
    private int status;

}


