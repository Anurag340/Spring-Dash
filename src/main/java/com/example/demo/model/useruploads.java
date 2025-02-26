package com.example.demo.model;

import jakarta.persistence.*;
@Entity
@Table(name = "useruploads")
public class useruploads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "indvid", nullable = false, unique = true)
    private int indvId;

    @Lob
    @Column(name = "profile_image", columnDefinition = "LONGBLOB")
    private byte[] profileImage;

    @Lob
    @Column(name = "img_pdf", columnDefinition = "LONGBLOB")
    private byte[] imgPdf;
}
