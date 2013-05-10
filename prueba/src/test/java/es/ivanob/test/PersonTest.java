package es.ivanob.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	
	private Person p;
	
	@Before
	public void setUp(){
		p = new Person();
		p.setAge(25);
		p.setId("72111122E");
		p.setName("Luis");
	}

	@Test
	public void isAdulttest() {
		assertTrue("The person must be over 18", p.getAge()>=18);
	}

}
