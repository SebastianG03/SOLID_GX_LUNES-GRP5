package com.example.solid_g_cinco_lunes.srp;

import java.util.regex.Pattern;

class UserValidator {
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
