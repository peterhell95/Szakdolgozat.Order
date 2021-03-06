package szakdolgozat.order.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import szakdolgozat.order.dto.OrderDTO;
import szakdolgozat.order.services.OrderService;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/list")
    public List<OrderDTO> getAllOrder() {
        return service.getAllOrder();
    }

    @GetMapping("/list/{id}")
    public OrderDTO getOrderById(@PathVariable Long id) {
        return service.getOneOrder(id);
    }

    @PostMapping("/add")
    public OrderDTO createOrder(@RequestBody OrderDTO order) {
        return service.createOrder(order);
    }
}