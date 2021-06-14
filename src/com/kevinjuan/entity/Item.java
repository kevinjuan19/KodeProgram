/**
 * @author Kevin Juan(1972002)
 */
package com.kevinjuan.entity;


import java.util.Set;

public class Item {
    private int id,price;
    private String name;
    private Category category;


    public Item(int ID, int price, String name, Set<Category> categories) {
    }

    public Item(int id, int price, String name, Category category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public Item() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
