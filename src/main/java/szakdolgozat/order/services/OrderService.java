package szakdolgozat.order.services;

import java.util.List;

import szakdolgozat.order.dto.OrderDTO;

public interface OrderService {
    public List<OrderDTO> getAllOrder();

    public OrderDTO getOneOrder(Long id);

    public OrderDTO createOrder(OrderDTO order);

}