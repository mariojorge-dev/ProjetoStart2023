package br.com.usuariosapi.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService{
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String enviarEmailTexto(String dest, String tit, String msg) {
		
		try {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("educaprotech@gmail.com");
		simpleMailMessage.setTo(dest);
		simpleMailMessage.setSubject(tit);
		simpleMailMessage.setText(msg);
		javaMailSender.send(simpleMailMessage);
		return "Email enviado com sucesso.";
		}catch (Exception ex) {
			return "Erro ao enviar o email.";
		}
	}
}