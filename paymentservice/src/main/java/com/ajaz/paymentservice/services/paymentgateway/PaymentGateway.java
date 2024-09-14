package com.ajaz.paymentservice.services.paymentgateway;

import com.stripe.exception.StripeException;

public interface PaymentGateway {

    String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);



}
