package com.example.solid_g_cinco_lunes.srp;


class UserManager {
    private UserValidator userValidator;
    private UserRepository userRepository;
    private NotificationService notificationService;
   
    UserManager() {
        userValidator = new UserValidator();
        userRepository = new UserRepository();
        notificationService = new NotificationService();
    }

    public void addUser(String email, String password) {
        if (userValidator.isValidEmail(email) && userValidator.isValidPassword(password)) {
            System.out.println("User credentials are valid. Adding user...");
            userRepository.save(email, password);
            System.out.println("User added successfully.");
            notificationService.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }

}




