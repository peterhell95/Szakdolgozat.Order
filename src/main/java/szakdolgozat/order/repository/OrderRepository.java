package szakdolgozat.order.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import szakdolgozat.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

    Optional<Order> findById(Long id);

    void deleteById(Long id);

}