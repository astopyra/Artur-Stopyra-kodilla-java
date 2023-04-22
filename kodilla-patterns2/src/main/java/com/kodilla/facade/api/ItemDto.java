package com.kodilla.facade.api;

public class ItemDto {
    private final Long productId;
    private final Long quantity;

    public ItemDto(Long productId, Long quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getQuantity() {
        return quantity;
    }
}
