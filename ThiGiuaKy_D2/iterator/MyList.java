package ThiGiuaKy_D2.iterator;

import java.util.ArrayList;

public class MyList implements MyIterable {
	private ArrayList<String> menuItems;
 
	public MyList() {
		menuItems = new ArrayList<String>();
	}

	public void addItem(String name) {
		/* TODO */
		menuItems.add(name);
	}
 
	public ArrayList<String> getMenuItems() {
		/* TODO */
		return menuItems;
	}
  
	public Iterator createIterator() {
		/* TODO */
		MyListIterator iterator = new MyListIterator(menuItems);
		return iterator;
	}
  
	public String toString() {
		/* TODO */
		return "My List Structure";
	}
}
