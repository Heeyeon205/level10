package _06열거타입;

public class PizzaStore {

	PizzaMenu[] menus = PizzaMenu.values();

	void printAllMenus() {
		for (PizzaMenu pizza : menus) {
			System.out.println(pizza);
		}
	}

	void takeOrder(String name) {
		PizzaMenu menu = PizzaMenu.getMenu(name);
		if (menu == null) {
			System.out.println("해당 피자는 존재하지 않습니다.");
			return;
		}
		System.out.println(menu.getPrice() + "원입니다.");
	}
}
