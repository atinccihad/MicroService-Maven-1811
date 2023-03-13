package firstPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test // Positive Test
	public void test() {
		
		App app = new App();
		
		int sonuc = app.userLogin("john", "1234");
        
		assertEquals(1, sonuc);
	}
	
	@Test // Negative Test
	public void test2() {
		
		App app = new App();
		
		int sonuc = app.userLogin("johnX", "1234");
        
		assertEquals(0, sonuc);
	}
}
