package com.gideonshawana.spring.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String username, @RequestParam String password) {
        // Add your login logic here
        // Check if the username and password are valid
        if (isValidLogin(username, password)) {
            // Redirect to the reservation page on successful login
            return "redirect:/reservation";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    private boolean isValidLogin(String username, String password) {
        // Implement your authentication logic here (e.g., check against a database)
        // Return true if the login is valid, false otherwise
        return true; // For demonstration purposes
    }
}
