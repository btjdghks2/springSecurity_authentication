package com.securityEx.securityExProject.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
}
