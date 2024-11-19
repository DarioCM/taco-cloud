package dev.dario.tacocloud.service;


import dev.dario.tacocloud.entity.TacoOrder;
import dev.dario.tacocloud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<TacoOrder> getAllOrders() {
        return (List<TacoOrder>) orderRepository.findAll();
    }

    public TacoOrder getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public TacoOrder saveOrder(TacoOrder order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public List<TacoOrder> getOrdersByDeliveryZip(String deliveryZip) {
        return orderRepository.findByDeliveryZip(deliveryZip);
    }

    public List<TacoOrder> getOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate) {
        return orderRepository.readOrdersByDeliveryZipAndPlacedAtBetween(deliveryZip, startDate, endDate);
    }

    public List<TacoOrder> getOrdersByDeliveryCityOrderByDeliveryName(String city) {
        return orderRepository.findByDeliveryCityOrderByDeliveryName(city);
    }
}
