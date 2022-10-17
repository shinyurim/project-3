package com.zerobase.fastlms.configuration.components;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;


@RequiredArgsConstructor
@Component
public class MailComponents {

    private final JavaMailSender javaMailSender;

    public void sendMailTest() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("yurim1298@gmail.com");
        msg.setSubject("안녕하세요. 테스트용입니다.");
        msg.setText("안녕하세요. 테스트 용입니다. 잘 가나용?");
        javaMailSender.send(msg);
    }

    public boolean sendMail(String mail, String subjcet, String text){

        boolean result = false;

        MimeMessagePreparator msg = new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
                mimeMessageHelper.setTo(mail);
                mimeMessageHelper.setSubject(subjcet);
                mimeMessageHelper.setText(text, true);
            }
        };
        try {
            javaMailSender.send(msg);
            result = true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
        }
    }

