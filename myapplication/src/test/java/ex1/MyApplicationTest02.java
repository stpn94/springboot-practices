package ex1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex01.MyApplication;
import ex01.MyComponent;

// @ExtendWith(SpringExtension.class)
// @ContextConfiguration(classes= {MyApplication.class})
@SpringBootTest(classes= {MyApplication.class})
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}