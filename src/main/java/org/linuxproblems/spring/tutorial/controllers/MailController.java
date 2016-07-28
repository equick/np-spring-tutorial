package org.linuxproblems.spring.tutorial.controllers;

import javax.annotation.Resource;

import org.linuxproblems.spring.tutorial.mail.MailSender;
import org.linuxproblems.spring.tutorial.mail.MockMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Resource
	private MailSender mailSender;
	
	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@example.com", "Some subject", "the content");
		return "Mail sent";
	}
}