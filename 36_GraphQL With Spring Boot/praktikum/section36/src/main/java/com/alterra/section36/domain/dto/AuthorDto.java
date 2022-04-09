package com.alterra.section36.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AuthorDto {
    private Long id;
    private String name;
    private String thumbnail;
    private List<PostDto> posts;
}
