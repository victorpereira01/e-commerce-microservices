package com.victorpc.ecommerce.checkout.services;

import com.victorpc.ecommerce.checkout.entities.CheckoutEntity;
import com.victorpc.ecommerce.checkout.repositories.CheckoutRepository;
import com.victorpc.ecommerce.checkout.resources.CheckoutRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
