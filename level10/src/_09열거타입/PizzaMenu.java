package _09열거타입;

public enum PizzaMenu {
	PP("페퍼로니피자", 10000, 0),
	CP("치즈피자", 12000,0),
	SP("스파이시소시지피자", 14000, 2),
	MP("마라피자", 13400, 3),
	HP("하와이안피자", 13000, 0),
	BP("불고기피자", 15000, 1);
	
	private String name = "";
	private int price;
	private int spicyLevel;
	
	private PizzaMenu(String name, int price, int spicyLevel) {
		this.name = name;
		this.price = price;
		this.spicyLevel = spicyLevel;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSpicyLevel1() {
		return spicyLevel;
	}
	public void setSpicyLevel1(int spicyLevel1) {
		this.spicyLevel = spicyLevel1;
	}
	
	public String getDesc() {
		String data = "";
		if(spicyLevel > 0) {
			data = "매움".repeat(spicyLevel);
		}
		return String.format("%s %d원 %s", name, price, data);
	}
	
	public static PizzaMenu getMenu(String name) {
		for(PizzaMenu pizza : PizzaMenu.values()) {
			if(name.equals(pizza.getName())) {
				return pizza;
			}
		}
		return null;
	}
}
