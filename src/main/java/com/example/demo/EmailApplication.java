package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.ws.mime.MimeMessage;

import javax.mail.internet.MimeMessage;


@SpringBootApplication
public class EmailApplication {
//implements CommandLineRunner {
//	
//	
//	@Autowired
//	private JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}
	
//	@Override
//	public void run(String...args)
//	{
//		System.out.println("Sending mail");
//		
//	try {
//		sendMail();
//	}
//	catch(MessagingException e)
//	{
//		e.printStackTrace();
//	}
//	System.out.println("done");
//	
//	}
//	void sendMail()
//	{
//		SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo("1@gmail.com", "2@yahoo.com");
//
//        msg.setSubject("Testing from Spring Boot");
//        msg.setText("Hello World \n Spring Boot Email");
//
//        javaMailSender.send(msg);
//	}
	
//	void sendMail() throws MessagingException
//	{
//		MimeMessage msg = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//        helper.setTo("kavikshanaujendapremalal@gmail.com");
//
//        helper.setSubject("Testing from Spring Boot");
//
//        
//        javaMailSender.send(msg);
//
//    }
		
	}
	

