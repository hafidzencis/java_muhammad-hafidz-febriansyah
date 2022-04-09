package com.alterra.section36.service;


import com.alterra.section36.domain.dao.Author;
import com.alterra.section36.domain.dao.Post;
import com.alterra.section36.domain.dto.AuthorDto;
import com.alterra.section36.domain.dto.PostDto;
import com.alterra.section36.repository.AuthorRepository;
import com.alterra.section36.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<PostDto> getPosts(int limit, int offset) {
        List<Post> postList = postRepository.findPostWithLimitAndOffset(limit, offset);
        List<PostDto> postDtoList = new ArrayList<>();
        for(Post post : postList) {
            postDtoList.add(
                    PostDto.builder()
                            .id(post.getId())
                            .author(AuthorDto
                                    .builder()
                                    .id(post.getAuthor().getId())
                                    .name(post.getAuthor().getName())
                                    .thumbnail(post.getAuthor().getThumbnail())
                                    .build())
                            .title(post.getTitle())
                            .category(post.getCategory())
                            .text(post.getText())
                            .build()
                    );
        }
        return postDtoList;
    }

    public PostDto createPost(String title, String text, String category) {
        Author author = authorRepository.save(Author
                .builder()
                .name("Hafidz")
                .thumbnail("hafidz image")
                .build());

        Post post = postRepository.save(Post
                .builder()
                .author(author)
                .category(category)
                .text(text)
                .title(title)
                .build());

        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .category(post.getCategory())
                .author(AuthorDto
                        .builder()
                        .id(post.getAuthor().getId())
                        .name(post.getAuthor().getName())
                        .thumbnail(post.getAuthor().getThumbnail())
                        .build())
                .text(post.getText())
                .build();
    }
}
