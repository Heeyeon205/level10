package _04추상화_실습2;

public class Main {

	public static void main(String[] args) {
		MyBakery store1 = new MyBakery("구미", false);
		MyBakery store2 = new MyBakery("강남", true);
		System.out.println(MyBakery.getSlogan());
		
		MyChicken store3 = new MyChicken("홍대");
		MyChicken store4 = new MyChicken("신촌");
		System.out.println(MyChicken.getSlogan());
		
		MyCafe store5 = new MyCafe("건대", true);
		MyCafe store6 = new MyCafe("성수", false);
		System.out.println(MyCafe.getSlogan());
		
		MyBrand[] myStores = {store1, store2, store3, store4, store5,store6};
		for(MyBrand stores : myStores) {
			if(stores instanceof MyBakery) {
				MyBakery mystore = (MyBakery)stores;
				stores.takeOrder();
			}
		}
		
	}

}
