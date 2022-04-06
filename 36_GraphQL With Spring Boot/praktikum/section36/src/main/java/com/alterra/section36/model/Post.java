package com.alterra.section36.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Post {
    public int id;
    public String title;
    public String text;
    public String category;
    public int author_id;

    Logger logger = LoggerFactory.getLogger(Post.class);

    public Post(int id,String title,String text,String category,int author_id){
        this.id= id;
        this.title= title;
        this.text = text;
        this.category = category;
        this.author_id = author_id;
        logger.info("Constructor Method in Author class");
    }
}