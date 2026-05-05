//package kadai_015;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//class Car_Chapter15Test {
//	Car_Chapter15 car = new Car_Chapter15();
//	@Test
//	@DisplayName("上限正常")
//	void test0() {
//		car.changeGear(5);
//		assertEquals(50, car.run());
//	}
//	@Test
//	@DisplayName("上限異常")
//	void test1() {
//		car.changeGear(6);
//		assertEquals(0, car.run());
//	}
//	@Test
//	@DisplayName("下限正常")
//	void test2() {
//		car.changeGear(1);
//		assertEquals(10, car.run());
//	}
//	@Test
//	@DisplayName("下限異常")
//	void test3() {
//		car.changeGear(0);
//		assertEquals(0, car.run());
//	}
//	@Test
//	@DisplayName("正常")
//	void test4() {
//		car.changeGear(3);
//		assertEquals(30, car.run());
//	}
//
//}
