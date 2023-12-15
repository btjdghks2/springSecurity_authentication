package com.securityEx.securityExProject.repository;

import java.util.Optional;

public interface MemberRepository {
    Optional<Object> findByUsername(String username);
}
