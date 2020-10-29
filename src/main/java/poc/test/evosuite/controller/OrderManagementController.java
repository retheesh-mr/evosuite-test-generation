package poc.test.evosuite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import poc.test.evosuite.model.Order;
import poc.test.evosuite.model.OrderItem;
import poc.test.evosuite.service.OrderManagerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping(value="/order")
public class OrderManagementController {

    @Autowired
    private OrderManagerService orderManagerService;

    @PostMapping(value="/createOrder")
    public @ResponseBody Order createOrder(@RequestBody List<OrderItem> orderItems){
        return orderManagerService.createOrder(orderItems);
    }

    @PostMapping(value="/deleteOrder")
    public @ResponseBody boolean deleteOrder(@RequestBody Order order){
        return orderManagerService.deleteOrder(order);
    }

    @PostMapping(value="/addNewItem")
    public @ResponseBody boolean addNewItem(@RequestBody OrderItem orderItem){
        return orderManagerService.addNewItemToExistingOrder(orderItem);
    }

    @PostMapping(value="/deleteItem")
    public @ResponseBody boolean deleteItem(@RequestBody OrderItem orderItem){
        return orderManagerService.removeItemFromOrder(orderItem);
    }
}
