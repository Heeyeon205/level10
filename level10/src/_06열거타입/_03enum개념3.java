package _06열거타입;

import java.util.ArrayList;

public class _03enum개념3 {

	public static void main(String[] args) {
		
		ArrayList<PizzaMenu> list = new ArrayList<PizzaMenu>();
		list.add(PizzaMenu.BP);
		list.add(PizzaMenu.CP);
		list.add(PizzaMenu.HP);
		list.add(PizzaMenu.MP);
		list.add(PizzaMenu.PP);
		list.add(PizzaMenu.SP);
		
		for(PizzaMenu pizza : list) {
			System.out.println(pizza.getDesc());
		}
		System.out.println("-----------");
		
		for(PizzaMenu pizza : list) {
			System.out.println(pizza.name());
		}
		System.out.println("-----------");
		
		for(PizzaMenu pizza : list) {
			System.out.println(pizza.ordinal());
		}
		System.out.println("-----------");
		
		PizzaStore store = new PizzaStore();
		store.printAllMenus();
		store.takeOrder("마라피자");
		store.takeOrder("고구마피자");
	}

}
