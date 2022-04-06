package com.alterra.section36.controller;

import com.alterra.section36.model.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {
    Logger logger = LoggerFactory.getLogger(PostController.class);
    @QueryMapping
    List<Post> posts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1,"Kebohongan Pejabat",
                "Segala tindakan apapun akan dilakukan pejabat untuk mencari suara",
        "Politik",1));
        posts.add(new Post(2,"Kancil Si Licik","Kancil suka melakukan hal apapun demi keinginannya",
                "Dongeng",2));
        posts.add(new Post(3,"Kebohongan Jokowi","Presiden ke 6 disukai masyarakat tapi diantara lain juga itdak disukai karena pandangannya sering berubah - ubah",
                "Politik",1));

        logger.info("Result Post Controller");
        return posts;

    }
}
