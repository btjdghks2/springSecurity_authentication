package com.securityEx.securityExProject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Getter;

@Entity
@Getter
public class Post {

    private Long id;

    private String title;

    private String content;

    @ManyToMany(fetch = FetchType.LAZY)
    private Member member;
}
