package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mahender.BalanceExpression;

import static org.junit.Assert.*;

import org.junit.Test;



public class BalanceExpressionTest {

	@Test
	public void test() {
		BalanceExpression be=new BalanceExpression();
		boolean result=be.balancing("{(a,b)}");
		assertEquals(true,result);
		
	}
	@Test
	public void test1() {
		BalanceExpression be=new BalanceExpression();
		boolean result=be.balancing("{(a},)))))b");
		assertEquals(false,result);
		
	}
	@Test
	public void test2() {
		BalanceExpression be=new BalanceExpression();
		boolean result=be.balancing("{((a,b))}");
		assertEquals(true,result);
		
	}

}
