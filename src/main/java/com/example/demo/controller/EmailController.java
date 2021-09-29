package com.example.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.EmailService;

@RestController
public class EmailController {
@Autowired
private EmailService emailService;
	
	@GetMapping(value="/sendMail")
	public String getMapping() {
		return "mail sent";
	}
		
	@GetMapping(value="/testSendMail")
	public String testSendMail() throws MessagingException
	{
		return emailService.sendMail();
	
	}
	
	@GetMapping(value="/testSendMailW")
	public String testSendMailW() throws MessagingException
	{
		return emailService.sendMailWithAttach();
	}
	
		
}


