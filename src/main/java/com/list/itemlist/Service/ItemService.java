package com.list.itemlist.Service;

import com.list.itemlist.database.DBService;
import com.list.itemlist.database.ItemDAO;
import com.list.itemlist.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private static DBService dataBase = new DBService();

    public boolean addItem(Item item) {
        dataBase.addItem(item);
        return true;
    }

    public void addItemToCart(int id) {
        dataBase.addItemToCart(id);
    }

    public List<Item> findAllInMain() {
        return dataBase.findAllInMain();
    }


    public Item findById(int id) {
        return dataBase.findById(id);
    }

    public int countOfItems(){
        return dataBase.countOfItems();
    }

    public void deleteFromCart(int id){
        dataBase.deleteFromCart(id);
    }


    public boolean deleteItem(int id) {
        dataBase.deleteItem(id);
        return true;
    }

    public List<Item> findAllInCart(){
        return dataBase.findAllInCart();
    }
}
