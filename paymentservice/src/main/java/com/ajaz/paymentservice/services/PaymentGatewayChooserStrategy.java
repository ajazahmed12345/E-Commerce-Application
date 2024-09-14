package com.ajaz.paymentservice.services;

import com.ajaz.paymentservice.services.paymentgateway.PaymentGateway;
import com.ajaz.paymentservice.services.paymentgateway.RazorpayPaymentGateway;
import com.ajaz.paymentservice.services.paymentgateway.StripePaymentGateway;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentGatewayChooserStrategy {
    private RazorpayPaymentGateway razorpayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayChooserStrategy(RazorpayPaymentGateway razorpayPaymentGateway, StripePaymentGateway stripePaymentGateway){
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway(){

//        int randomInt = new Random().nextInt();
//
//        if(randomInt%2 == 0){
//            return razorpayPaymentGateway;
//        }
//
//
//        return stripePaymentGateway;

        return stripePaymentGateway;

    }


}
