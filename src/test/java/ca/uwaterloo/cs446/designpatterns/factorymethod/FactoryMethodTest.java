package ca.uwaterloo.cs446.designpatterns.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryMethodTest {
	@Test
	public void test() {
		CarFactory factory = new SmallCarFactory();
		assertEquals(factory.testHonk(), "beep beep");
		
		factory = new BigCarFactory();
		assertEquals(factory.testHonk(), "honk honk");
	}
}
