package com.sylviomaggessi.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sylviomaggessi.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
