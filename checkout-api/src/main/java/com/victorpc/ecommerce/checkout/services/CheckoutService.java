package com.victorpc.ecommerce.checkout.services;

import com.victorpc.ecommerce.checkout.entities.CheckoutEntity;
import com.victorpc.ecommerce.checkout.resources.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
