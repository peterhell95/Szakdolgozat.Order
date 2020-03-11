package szakdolgozat.order.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.Setter;
import szakdolgozat.order.dto.OrderDTO;
import szakdolgozat.order.mapper.OrderMapper;
import szakdolgozat.order.model.Order;
import szakdolgozat.order.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    @Getter
    @Setter
    private OrderRepository repository;

    @Autowired
    private OrderMapper orderMapper;

    public List<OrderDTO> getAllOrder() {
        return orderMapper.orderListToOrderDTOList(repository.findAll());
    }

    public OrderDTO getOneOrder(Long id) {
        return orderMapper.orderToOrderDTO(repository.findById(id).get());
    }

    public OrderDTO createOrder(OrderDTO order) {
        Order entity = orderMapper.orderDTOToOrder(order);
        return orderMapper.orderToOrderDTO(repository.save(entity));
    }

}