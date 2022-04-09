package com.alterra.section36.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostDto {
    private Long id;
    private String title;
    private String text;
    private String category;
    private AuthorDto author;
}