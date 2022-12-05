package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public ProductOrderService(OrderService orderService, OrderRepository orderRepository, InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public void process(final OrderRequest orderRequest){
        boolean isAvailable = orderService.order(orderRequest.getClient(), orderRequest.getProduct());
        if(isAvailable){
            orderRepository.createOrder(orderRequest.getClient(), orderRequest.getProduct());
            informationService.inform(orderRequest.getClient());
        }else{
            System.out.println("order couldn't be made");
        }
    }
}
