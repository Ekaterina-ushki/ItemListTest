package com.list.itemlist.database;

import com.list.itemlist.model.Item;

import java.util.List;


public interface ItemDAO {
    void addItem(Item item);
    List<Item> findAllInMain();
    Item findById(int id);
    void deleteItem(int id);
    int countOfItems();
    List<Item> findAllInCart();
    void addItemToCart(int id);
    void deleteFromCart(int id);
}
