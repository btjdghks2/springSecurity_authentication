package com.securityEx.securityExProject.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private Long id;

    private String username;

    private String password;

    private String email;

    @OneToMany(mappedBy = "Member",cascade = CascadeType.ALL)
    private List<Post> post = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public Member(String username, String password, String email, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public Member update(String username, String password) {
        this.username = username;
        this.password = password;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }


}
