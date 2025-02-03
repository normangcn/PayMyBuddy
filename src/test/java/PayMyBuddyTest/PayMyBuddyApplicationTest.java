package PayMyBuddyTest;

import com.oc.PayMyBuddy.PayMyBuddyApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = PayMyBuddyApplication.class)
class PayMyBuddyApplicationTest {

	@Test
	public void testTest(){
		assertEquals(1,1);
	}
	@Test
	public void contextLoads() {

	}

}
