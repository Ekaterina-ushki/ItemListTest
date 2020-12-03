package com.list.itemlist;

import com.list.itemlist.Service.ItemService;
import com.list.itemlist.database.DBService;
import com.list.itemlist.model.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class ItemServiceTest {

	@InjectMocks
	private ItemService itemService;

	@Mock
	private DBService dataBase;

	@Test
	void addItem() {
		Item item = new Item(0, "Хлеб", 1, "Необходимо купить");
		boolean isItemCreated = itemService.addItem(item);
		Assert.assertTrue(isItemCreated);
		//Mockito.verify(dataBase, Mockito.times(1)).addItem(item);
	}

	@Test
	void deleteItem() {
		boolean isItemDeleted = itemService.deleteItem(1);
		Assert.assertTrue(isItemDeleted);
		//Mockito.verify(dataBase, Mockito.times(1)).deleteItem(1);
	}
}
