package com.alterra.section36.controller;

import com.alterra.section36.domain.dto.PostDto;
import com.alterra.section36.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @QueryMapping
    public List<PostDto> recentPost(@Argument int count, @Argument int offset) {
        return postService.getPosts(count, offset);
    }

    @MutationMapping
    public PostDto writePost(@Argument String title, @Argument String text, @Argument String category) {
        return postService.createPost(title, text, category);
    }
}
