import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class JUnitFibonacci {

	@Test
	public void test() {
		Fibonacci a = new Fibonacci();
		a.fibCompute();
		assertEquals(1, a.getFib(1));
		assertEquals(0, a.getFib(0));
	}

	@Test
	public void test1() {
		Fibonacci a = new Fibonacci(89);
		a.fibCompute();
		assertEquals(1100087778366101931L, a.getFib(88));
	}
}
