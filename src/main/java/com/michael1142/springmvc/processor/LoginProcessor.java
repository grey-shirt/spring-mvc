package com.michael1142.springmvc.processor;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    public boolean login() {
        return true;
    }
}
