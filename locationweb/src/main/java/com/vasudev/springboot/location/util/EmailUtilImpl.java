package com.vasudev.springboot.location.util;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailUtilImpl implements EmailUtil{
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendEmail(String toAddress, String subject, String body) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper= new MimeMessageHelper(mimeMessage);
        try {
            mimeMessageHelper.setTo(toAddress);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(body);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        javaMailSender.send(mimeMessage);
    }
}
