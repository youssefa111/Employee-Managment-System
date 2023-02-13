package net.javaguides.springbootthymeleafcrudwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springbootthymeleafcrudwebapp.dto.UserRegistrationDto;
import net.javaguides.springbootthymeleafcrudwebapp.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegisterationController {

    private UserService userService;

    public UserRegisterationController(UserService userService) {
        super();
        this.userService = userService;
    }

    // @ModelAttribute("user")
    // public UserRegistrationDto userRegistrationDto() {
    // return new UserRegistrationDto();
    // }

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {

        System.out.println("password in controller =====>" + registrationDto.getPassword());
        userService.save(registrationDto);

        return "redirect:/registration?success";
    }
}
