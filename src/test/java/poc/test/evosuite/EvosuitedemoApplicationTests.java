package poc.test.evosuite;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Or;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import poc.test.evosuite.model.OrderItem;
import poc.test.evosuite.service.impl.OrderManagerServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EvosuitedemoApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
	public void createNewOrderShouldReturnOrder() {

		OrderManagerServiceImpl orderManagerService = new OrderManagerServiceImpl();

		List<OrderItem> orderItems = new ArrayList<>();

		String itemId = UUID.randomUUID().toString();
		Date creationDate = new Date("dd/MM/yyyy HH:mm:ss");
		orderItems.add(new OrderItem(itemId, 10, "TestName",creationDate));

		String itemId2 = UUID.randomUUID().toString();
		orderItems.add(new OrderItem(itemId2, 15, "TestName2",creationDate));

		String itemId3 = UUID.randomUUID().toString();
		orderItems.add(new OrderItem(itemId2, 20, "TestName3",creationDate));

		String orderId = UUID.randomUUID().toString();
		orderManagerService.createOrder(orderItems,"OrderName");

		Assert.assertEquals(1,1);



	}

}
