package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getDeliveryDate());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getDeliveryDate());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDeliveryDate());
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDeliveryDate());
        }
    }
}