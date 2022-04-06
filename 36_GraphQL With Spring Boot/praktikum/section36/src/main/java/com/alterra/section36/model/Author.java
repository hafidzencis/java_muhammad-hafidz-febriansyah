package com.alterra.section36.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Author {

    Logger logger = LoggerFactory.getLogger(Author.class);
    public int id;
    public String name;
    public String thumbnail;
    public int post_id;


    public Author(int id, String name,String thumbnail,int post_id){
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.post_id = post_id;

        logger.info("Constructor Method in Author class");
    }


}
