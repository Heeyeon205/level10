package _06추상화_실습1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		PizzaService service = new PizzaService();
		ArrayList<Pizza> orderList = new ArrayList<Pizza>();
		
		orderList.add(new SweetPotatoPizza(12000, "피자헛"));
		orderList.add(new BulgogiPizza(23000, "미스터피자"));
		orderList.add(new PineApplePizza(18000, "도미노피자"));
		
		service.orderPizzas(orderList);
	}

}
