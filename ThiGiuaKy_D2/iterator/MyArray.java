package ThiGiuaKy_D2.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
  
	public void addItem(String name) {
		/* TODO */
		menuItems[numberOfItems] = name;
		numberOfItems++;
	}
 
	public String[] getMenuItems() {
		/* TODO */
		return menuItems;
	}
  
	public Iterator createIterator() {
		/* TODO */
		Iterator iterator = new MyArrayIterator(menuItems);
		return iterator;
	}
 
	public String toString() {
		return "My Array Structure";
	}
}
