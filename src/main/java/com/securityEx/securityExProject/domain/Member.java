package com.securityEx.securityExProject.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    private Long id;

    private String username;

    private String password;

    private String email;

    @OneToMany(mappedBy = "Member",cascade = CascadeType.ALL)
    private List<Post> post = new ArrayList<>();

}
