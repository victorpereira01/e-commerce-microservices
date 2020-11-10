package com.victorpc.ecommerce.checkout.resources;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    @PostMapping("/")
    public ResponseEntity<Void> create(@RequestBody CheckoutRequest checkoutRequest) {
        return ResponseEntity.ok().build();
    }
}
