package ThiGiuaKy_D2.decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		 /* TODO */
		for (int i = 0; i < 5; i++) {
			breads.add(new Cheese(new ThickcrustBread()));
			breads.add(new Olives(new ThickcrustBread()));
			breads.add(new Cheese(new Olives(new ThickcrustBread())));
			breads.add(new Cheese(new ThincrustBread()));
			breads.add(new Olives(new ThickcrustBread()));
			breads.add(new Cheese((new Olives(new ThincrustBread()))));
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		/* TODO */
		for (int i = 0; i < breads.size(); i++) {
			if (breads.get(i).cost() == bread.cost()) {
				breads.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for (Bread i : breads) {
			System.out.println(i.getDescription());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> sort = breads;
		if (order) {
			for (int i = 0; i < sort.size() - 1; i++) {
				for (int j = 0; j < sort.size() - i - 1; j++) {
					if (sort.get(j).cost() > sort.get(j + 1).cost()) {
						Bread temp = sort.get(j);
						sort.set(j, sort.get(j + 1));
						sort.set(j + 1, temp);
					}
				}
			}
		} else {
			for (int i = 0; i < sort.size() - 1; i++) {
				for (int j = 0; j < sort.size() - i - 1; j++) {
					if (sort.get(j).cost() < sort.get(j + 1).cost()) {
						Bread temp = sort.get(j);
						sort.set(j, sort.get(j + 1));
						sort.set(j + 1, temp);
					}
				}
			}
		}
		return sort;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> filter = new ArrayList<>();
		List<Bread> sort = sort(order);
		for (int i = sort.size() - 1; i > sort.size() - howMany - 1; i--) {
			filter.add(sort.get(i));
		}
		return filter;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */

		System.out.println("Add 1 thick crust bread: ");
		breadStore.add(new ThickcrustBread());
		breadStore.print();

		System.out.println("\nSell 1 thick crust bread: ");
		breadStore.sell(new ThickcrustBread());
		breadStore.print();

		System.out.println("\nSort breads by ascending cost: ");
		breadStore.sort(true);
		breadStore.print();

		System.out.println("\n10 cheapest breads in the store: ");
		List<Bread> result = breadStore.filter(10, false);
		for (Bread i : result) {
			System.out.println(i.getDescription());
		}
	}
}
