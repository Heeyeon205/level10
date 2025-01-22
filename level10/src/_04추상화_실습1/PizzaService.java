package _04추상화_실습1;

import java.util.ArrayList;

public class PizzaService {
	
	void orderPizzas(ArrayList<Pizza> orderList) {
		// 배열 -> 같은 타입이 여러개 들어간다.
		for(Pizza p : orderList) {
			p.makingPizza();
			System.out.println("-------------");
		}
	}
}
