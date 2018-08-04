package br.com.linqsys.curso.services;

import br.com.linqsys.curso.domain.Cliente;
import br.com.linqsys.curso.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
}
