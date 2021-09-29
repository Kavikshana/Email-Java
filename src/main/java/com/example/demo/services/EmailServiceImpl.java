package com.example.demo.services;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("emailServiceImpl")
public class EmailServiceImpl implements EmailService{

@Autowired
private JavaMailSender javaMailSender;

	public String sendMail() {
		
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setFrom("kavikshanaujendapremalal@gmail.com@gmail.com");
		msg.setTo("ks97679295@gmail.com");
		msg.setSubject("registered");
		msg.setText("Test");
		javaMailSender.send(msg);
		
		return "mail sent successfully";
	}
	
	public String sendMailWithAttach() {
		
		MimeMessage msg;
		try {
			msg =JavaMailSender.createMimeMessage();
			MimeMessageHelper helper= new MimeMessageHelper(msg,true);
			helper.setFrom("kavikshanaujendapremalal@gmail.com@gmail.com");
			helper.setTo("ks97679295@gmail.com");
			helper.setSubject("registered");
			helper.setText("Test");
			javaMailSender.send(msg);
			
			File file =new File("C:\\Users\\KaviKala\\Desktop\\New folder\\New Text Document");
			
			helper.addAttachment(file.getName(),file);
			javaMailSender.send(msg);
			
			return "mail sent successfully";
		} 
		catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
}

