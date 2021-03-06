
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitGCD {

	@Test
	public void test() {
		GCD a = new GCD();
		assertEquals(839516160, a.gcd(839516160, 0));
	}

	@Test
	public void test1() {
		GCD a = new GCD();
		assertEquals(2, a.gcd(1912602640, 1198682738));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(67108864, a.gcd(-67108864, 0));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1769473, 301793282));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(360, a.gcd(2075703480, -1649035080));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(2129664, a.gcd(2129664, 0));
	}

	@Test
	public void test7() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1416128883, 543781664));
	}

	@Test
	public void test8() {
		GCD a = new GCD();
		assertEquals(2, a.gcd(-1338093054, -117440750));
	}

	@Test
	public void test9() {
		GCD a = new GCD();
		assertEquals(4, a.gcd(828448852, 1702038120));
	}

	@Test
	public void test10() {
		GCD a = new GCD();
		assertEquals(1291845632, a.gcd(1291845632, 0));
	}

	@Test
	public void test11() {
		GCD a = new GCD();
		assertEquals(16777216, a.gcd(0, -16777216));
	}

	@Test
	public void test12() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(643704100, 591405353));
	}

	@Test
	public void test13() {
		GCD a = new GCD();
		assertEquals(3, a.gcd(-927229341, 696188928));
	}

	@Test
	public void test14() {
		GCD a = new GCD();
		assertEquals(14286848, a.gcd(-14286848, 0));
	}

	@Test
	public void test15() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(-458753, -268632065));
	}
}
