package org.itstep.springthymeleafemail;

import lombok.Data;

import java.util.Map;

@Data
public class Email {
    String from;
    String to;
    String subject;
    String text;
    String template;
    Map<String, Object> properties;
}
