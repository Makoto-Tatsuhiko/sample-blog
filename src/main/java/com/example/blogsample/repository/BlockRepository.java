package com.example.blogsample.repository;

import com.example.blogsample.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<Blog, Integer> {
}
