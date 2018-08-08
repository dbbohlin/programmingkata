package nameinverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNameInverter {
	NameInverter inverter;
	
	@BeforeEach
	void setUp() throws Exception {
		inverter = new NameInverter();
	}

	@Test
	void test_NameInverter() {
		NameInverter inverter = new NameInverter();
	}
	
	@Test
	void test_SendNameStringReturnLastnameFirstname() {
		assertEquals("Smith,John", inverter.invertName("John Smith"));
	}

	@Test
	void test_ExtraSpacesAreRemoved() {
		assertEquals("Smith,John", inverter.invertName("   John   Smith   "));
	}
	
	@Test
	void test_RemoveHonorifics() {
		assertEquals("Smith,John", inverter.invertName("Mr. John Smith"));
	}
	
	@Test
	void test_PutPostNominialsAtEnd() {
		assertEquals("Smith,John PhD.", inverter.invertName("John Smith PhD."));
	}
	
	@Test
	void test_MultiplePostnominails() {
		assertEquals("Smith,John Sr. PhD.", inverter.invertName("John Smith Sr. PhD."));
	}
	
	@Test
	void test_ComplexName() {
		assertEquals("Smith,John Sr. PhD.", inverter.invertName("Mr.   John   Smith   Sr.   PhD."));
	}

}
