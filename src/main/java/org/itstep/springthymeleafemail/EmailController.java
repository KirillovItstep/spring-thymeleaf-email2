package org.itstep.springthymeleafemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;

    @RequestMapping("/text")
    public String sendText(Model model){
        Email email = new Email();
        email.setFrom("kirillov203509@gmail.com");
        email.setTo("kirillov203509@gmail.com");
        email.setSubject("Subject");
        email.setText("Text");
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alex");
        properties.put("subscriptionDate", LocalDate.now().toString());
        email.setProperties(properties);
        emailService.sendTextMessage(email);
        return "success.html";
    }

}
