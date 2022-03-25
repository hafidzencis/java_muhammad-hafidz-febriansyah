package com.example.section23.entity;

import javax.persistence.*;

@Entity
@Table(name = "objectthings")
public class ObjectThings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "product")
    private String product;

    @Column(name = "name")
    private String name;

    @Column (name = "description")
    private String description;

    @Column (name = "stock")
    private Integer stock;

    @Column (name = "price")
    private Integer price;

    public String getProduct(){
        return product;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
