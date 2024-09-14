package com.ajaz.paymentservice.controllers;

import com.ajaz.paymentservice.dtos.InitiatePaymentRequestDto;
import com.ajaz.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @GetMapping("/")
//    public String sayHello(){
//        return "hello";
//    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto request){
        return paymentService.initiatePayment(request.getOrderId(), request.getEmail(),
                request.getPhoneNumber(), request.getAmount());
    }
}
