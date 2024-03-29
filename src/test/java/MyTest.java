import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MyTest {

	@Test
	void test1() {
		Coffee order = new Cream(new Cream(new BasicCoffee()));
		assertEquals(4.99, order.makeCoffee());
	}
	@Test
	void test2() {
		Coffee order = new Caramel(new Cream(new Cream(new BasicCoffee()))) ;
		assertEquals(5.59, order.makeCoffee());
	}
	@Test
	void test3() {
		Coffee order = new Sugar(new Cream(new BasicCoffee()));
		assertEquals(4.99, order.makeCoffee());
	}
	@Test
	void test4() {
		Coffee order = new Caramel(new Mocha(new BasicCoffee()));
		double tCost = order.makeCoffee();
		tCost = Math.round(tCost*100)/100.0;
		assertEquals(5.19, tCost);
	}
	@Test
	void test5() {
		Coffee order = new ExtraShot(new ExtraShot(new Caramel(new Mocha(new BasicCoffee()))));
		double tCost = order.makeCoffee();
		tCost = Math.round(tCost*100)/100.0;
		assertEquals(7.59, tCost);
	}
	@Test
	void test6() {
		Coffee order = new Sugar(new Cream(new ExtraShot(new Caramel(new Mocha(new BasicCoffee())))));
		double tCost = order.makeCoffee();
		tCost = Math.round(tCost*100)/100.0;
		assertEquals(7.39, tCost);
	}
	@Test
	void test7() {
		Coffee order = new BasicCoffee();
		assertEquals(3.99, order.makeCoffee());
	}
	@Test
	void test8() {
		Coffee order = new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha
				(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha
						(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new Mocha(new BasicCoffee())))))))))))))))))))))))))));
		assertEquals(20.19, order.makeCoffee());
	}
	@Test
	void test9() {
		Coffee order = new Cream(new Caramel((new BasicCoffee())));
		assertEquals(5.09, order.makeCoffee());
	}
	@Test
	void test10() {
		Coffee order = new Mocha(new Sugar(new Cream(new BasicCoffee())));
		assertEquals(5.59, order.makeCoffee());
	}

}
