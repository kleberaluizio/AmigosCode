package com.kleberaluizio.Mot;

import com.kleberaluizio.email.EmailService;

//@Component
public class MOTService {
    private EmailService emailService;

//    @Autowired
    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
