package com.alterra.section36.repository;


import com.alterra.section36.domain.dao.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(value = "SELECT * FROM posts LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Post> findPostWithLimitAndOffset(int limit, int offset);
}
