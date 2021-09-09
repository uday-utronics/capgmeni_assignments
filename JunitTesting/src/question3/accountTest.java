package question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import org.junit.Test;


class accountTest {

	// this checks the exceptions on account class
	@Test
	void test() throws InsufficientBalanceException, IllegalBankTransactionException {
		account myacc = new account(1, 10000);
		//myacc.withdraw(100000);
		assertThrows(InsufficientBalanceException.class, ()-> myacc.withdraw(100000));
		//fail("Not yet implemented");
	}

	// testing IllegalException 
	@Test
	void test1() {
		account myacc = new account(1, 10000);
		assertThrows(IllegalBankTransactionException.class, ()-> myacc.withdraw(-200));

	}
	
	//checking withdraw correctly working or not
	@Test
	void test2() throws InsufficientBalanceException, IllegalBankTransactionException {
		account myacc = new account(1, 10000);
		assertEquals(9500, myacc.withdraw(500));
		
	}
	
	/*
	 * @Test(expected = InsufficientBalanceException.class) void test3() throws
	 * InsufficientBalanceException, IllegalBankTransactionException { account myacc
	 * = new account(1, 10000); myacc.withdraw(1000000); }
	 */
	 
	
}
