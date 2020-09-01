package com.willian.springmc.services;

import org.springframework.mail.SimpleMailMessage;

import com.willian.springmc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
