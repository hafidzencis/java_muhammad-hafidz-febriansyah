package com.alterra.section36.controller;

import com.alterra.section36.model.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorController {
    Logger logger = LoggerFactory.getLogger(AuthorController.class);
    @QueryMapping
    List<Author> authors(){
        List<Author> authors = new ArrayList<>();
        authors.add(new Author(1,"Rocky Gerung","rocke gerung bersila",1));
        authors.add(new Author(2,"Andere hirata","si kancil mengangkat 1 kaki",2));
        authors.add(new Author(3,"Rocky Gerung","rocke gerung menunjuk jokowi",3));
        logger.info("Result Author Controller");

        return authors;
    }
}
