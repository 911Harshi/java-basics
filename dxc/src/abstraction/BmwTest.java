package abstraction;
import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest extends TestCase  {
	@Test
	public void testAdd() {
		System.out.println("Iam in test add method");
		int expected = 30;
		int actual = BmwFlyingCar.add(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testElgibility() {
		System.out.println("Iam in test eligi method");
		boolean expected = false;
		boolean actual = BmwFlyingCar.isEligibletoVote(18);

		//assertFalse(actual);
		assertTrue(actual);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("Iam  setting up the resources");
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("Iam  Releasing up the resources");
	}
	

}
